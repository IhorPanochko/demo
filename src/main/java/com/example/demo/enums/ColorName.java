package com.example.demo.enums;


public enum ColorName {

    RED("red"),
    YELLOW("yellow"),
    BLUE("blue"),
    GREEN("green") ,
    BLACK("black"),
    WHITE("white");

    public String color;



     ColorName(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorName{" +
                "color='" + color + '\'' +
                '}';
    }
}
