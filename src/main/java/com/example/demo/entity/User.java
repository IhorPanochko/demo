package com.example.demo.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

/**
 * Created by 1 on 09.04.2019.
 */
@Entity
public class User {


    public User() {
    }

    public User(String name, Byte age) {
        this.name = name;
        this.age = age;
    }



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(length = 20, nullable = false , unique = false)
    private String name;

    @Column(nullable = false )
    private Byte age;

    public Long getId() {
        return id;
    }
    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Article>articles;

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}
