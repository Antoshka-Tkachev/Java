package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static private Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
	    ArrayList<String> cashes = new ArrayList<String>();
	    cashes.add("1228 RUB");
	    cashes.add("28.19 EU");
	    cashes.add("27 USD");
	    cashes.add("12RUB");
	    cashes.add("0 usd");
        cashes.add("Twenty EU");
	    cashes.add("28000 RUB");
	    cashes.add("1900 EU");
	    cashes.add("10000 USD");
        System.out.println("Все запросы по категории \"Деньги\":");
	    for (String cashRequest : cashes) {
            System.out.println(cashRequest);
        }
        Pattern pattern = Pattern.compile("^([0-9]|([0-9]+\\.+[0-9]))+\\s(RUB|EU|USD)");
        Iterator<String> iterator = cashes.iterator();
        while (iterator.hasNext()) {
            Matcher match = pattern.matcher(iterator.next());
            if (!match.matches()) {
                iterator.remove();
            }
        }
        System.out.println("Все верные запросы по категории \"Деньги\":");
        for (String cashTrueRequest : cashes) {
            System.out.println(cashTrueRequest);
        }
        System.out.println("\n");

        System.out.print("Введите пароль: ");
        String password;
        Pattern patternPIN = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$");
        Matcher matchPIN;
        do {
            password = in.next();
            matchPIN = patternPIN.matcher(password);
            if (!matchPIN.matches()) {
                System.out.println("Небезопасный пароль! " +
                        "Должно быть не менее 8 символов, включая цифры, заглавные и маленькие англисйкие буквы!");
                System.out.print("Введите пароль: ");
            }
        } while (!matchPIN.matches());
        System.out.println("Надёжный пароль!");
    }
}