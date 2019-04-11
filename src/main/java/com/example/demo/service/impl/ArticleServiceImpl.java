package com.example.demo.service.impl;

import com.example.demo.dto.ArticleDto;
import com.example.demo.entity.Article;
import com.example.demo.enums.Color;
import com.example.demo.enums.ColorName;
import com.example.demo.repository.ArticleRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 1 on 09.04.2019.
 */
@Service
public class ArticleServiceImpl implements ArticleService{

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Article> findByColor(String color) {
        return articleRepository.findByColor(color);
    }

    @Override
    public void addArticle(ArticleDto articleDto) {
        articleRepository.save(new Article(articleDto.getText(), Color.getColor(ColorName.valueOf(articleDto.getColor().toUpperCase())),userRepository.getOne(articleDto.getUserId())));
    }
}
