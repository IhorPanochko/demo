package com.example.demo.enums;


public class Color {

    public static String getColor(ColorName colorName){

        switch (colorName){
            case RED:
                return "red";
            case BLUE:
                return "blue";
            case BLACK:
                return "black";
            case GREEN:
                return "green";
            case WHITE:
                return "white";
            case YELLOW:
                return "yellow";
                default:
                    return "null";
        }
    }
}
