package com.example.demo.service.impl;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.Article;
import com.example.demo.entity.User;
import com.example.demo.repository.ArticleRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by 1 on 09.04.2019.
 */
@Service
public class UserServiceImpl implements UserService {


@Autowired
private UserRepository userRepository;

@Autowired
private ArticleRepository articleRepository;

    public UserDto userToDto(User user){
    return new UserDto(user.getName(),user.getAge());
    }

    public List<UserDto>usersToDto(List<User> users){
        return users.stream().map(u->userToDto(u)).collect(Collectors.toList());
    }

    @Override
    public List<UserDto> getAllUserOlderThan(Byte age) {
        return usersToDto(userRepository.findAllByAgeGreaterThan(age));
    }


    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }

    @Override
    public List<User> distinctUsersNames() {
        return userRepository.findAll().stream().filter(user -> (user.getArticles().size()>3)).filter(distinctByKey(User::getName)).collect(Collectors.toList());
    }

    public UserDto getUserFromArticle(Article article){
        return userToDto(article.getUser());
    }

    @Override
    public void addUser(UserDto userDto) {
        userRepository.save(new User(userDto.getName(),userDto.getAge()));
    }

    @Override
    public List<UserDto> usersByArticleColor(String color) {
        return articleRepository.findByColor(color).stream().map(article -> getUserFromArticle(article)).collect(Collectors.toList());




    }
}
