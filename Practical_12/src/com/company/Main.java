package com.company;

public class Main {

    public static void main(String[] args) {
        Address s1 = new Address();
        s1.firstSearch("Россия. Москва. Москва. Халтуринская. 45. 3. 7");
        System.out.println("Адрес 1\n" + s1.toString());

        Address s2 = new Address();
        s2.firstSearch("Украина; Чернигов; Чернигов; Блинная; 1; 2; 3");
        System.out.println("Адрес 2\n" + s2.toString());

        Address s3 = new Address();
        s3.firstSearch("Франция-Париж-Париж-Шанельная-3-2-5");
        System.out.println("Адрес 3\n" + s3.toString());

        Address s4 = new Address();
        s4.secondSearch("Россия, Московская область, Коломна, Крупской, 45, 1, 5");
        System.out.println("Адрес 4\n" + s4.toString());
    }
}