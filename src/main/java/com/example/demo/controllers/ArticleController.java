package com.example.demo.controllers;

import com.example.demo.dto.ArticleDto;
import com.example.demo.dto.UserDto;
import com.example.demo.entity.Article;
import com.example.demo.entity.User;
import com.example.demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 1 on 09.04.2019.
 */
@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

//    @GetMapping("api/article/get")
//    public ResponseEntity<List<Article>> distinctUsersNames(){
//        HttpHeaders responseHeaders = new HttpHeaders();
//        return ResponseEntity.ok().headers(responseHeaders).body(articleService.findByColor("red"));
//    }

    @PostMapping("api/article/add")
    public ResponseEntity<?>addArticle(@RequestBody ArticleDto articleDto){
        System.out.println(articleDto.toString());
       articleService.addArticle(articleDto);
        return new ResponseEntity<Void>(HttpStatus.OK);

    }
}
