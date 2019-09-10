package com.company;

public class Book {
    private String name;
    private String autor;
    private double price;

    public Book(String name, String autor, double price){
        this.name = name;
        this.autor = autor;
        this.price = price;
    }

    public Book(String name, String autor){
        this.name = name;
        this.autor = autor;
        this.price = 0;
    }
    public Book(String name){
        this.name = name;
        this.autor = "default";
        this.price = 0;
    }

    public Book(){
        this.name = "default";
        this.autor = "default";
        this.price = 0;
    }

    public void set_name(String name){
        this.name = name;
    }

    public void set_autor(String autor){
        this.autor = autor;
    }

    public void set_price(double price){
        this.price = price;
    }

    public String get_name(){
        return name;
    }

    public String get_autor(){
        return autor;
    }

    public double get_price(){
        return price;
    }

    public String ToString(){
        return "Название книги: " + name + " Автор книги: " + autor + " Цена книги: " + price;
    }
}
