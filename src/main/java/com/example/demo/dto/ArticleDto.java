package com.example.demo.dto;


public class ArticleDto {

    public ArticleDto() {
    }

    public ArticleDto(String text, String color, Long userId) {
        this.text = text;
        this.color = color;
        this.userId = userId;
    }

    private String text;

    private String color;

    private Long userId;



    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "ArticleDto{" +
                "text='" + text + '\'' +
                ", color='" + color + '\'' +
                ", userId=" + userId +
                '}';
    }
}
