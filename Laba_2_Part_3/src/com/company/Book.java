package com.company;

public class Book {
    private String name;
    private String autor;
    private double price;
    private int year;

    public Book(String name, String autor, double price, int year){
        this.name = name;
        this.autor = autor;
        this.price = price;
        this.year = year;
    }

    public Book(){
        this.name = "default";
        this.autor = "default";
        this.price = 0;
        this.year = 0;
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

    public void set_year(int year){
        this.year = year;
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

    public int get_year(){
        return year;
    }

    public String ToString(){
        return "Название книги: " + name + ", Автор книги: " + autor + ", Цена книги: " + price + ", Год издания книги: " + year;
    }
}