package com.example.demo.service;

import com.example.demo.dto.ArticleDto;
import com.example.demo.entity.Article;

import java.util.List;

/**
 * Created by 1 on 09.04.2019.
 */
public interface ArticleService {


    List<Article>findByColor(String color);

    void addArticle(ArticleDto articleDto);

}
