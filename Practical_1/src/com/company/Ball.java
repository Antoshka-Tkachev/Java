package com.company;

public class Ball {
    private int size;
    private String color;

    public Ball(int size, String color){
        this.size = size;
        this.color = color;
    }

    public Ball(String color){
        this.size = 0;
        this.color = color;
    }
    public Ball(int size){
        this.size = size;
        this.color = "default";
    }

    public Ball(){
        this.size = 0;
        this.color = "default";
    }

    public void set_size(int size){
        this.size = size;
    }

    public void set_color(String color){
        this.color = color;
    }

    public int get_size(){
        return size;
    }

    public String get_color(){
        return color;
    }

    public String ToString(){
        return "Размер мяча: " + size + " Цвет мяча: " + color;
    }
}
