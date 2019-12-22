package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    static private Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Нагиев", "89010000000"));
        contacts.add(new Contact("Антон", "89160000001"));
        contacts.add(new Contact("Макс", "89160000002"));
        contacts.add(new Contact("Полина", "89160000003"));
        contacts.add(new Contact("Сестра", "89990000004"));
        contacts.add(new Contact("Дима", "89010000005"));
        contacts.add(new Contact("Катя", "777777777"));
        contacts.add(new Contact("Пугчева", "89010000007"));
        contacts.add(new Contact("Мама", "89160000008"));
        contacts.add(new Contact("Алина", "123456"));


        HashTable<String, String> hashTable = new HashTable<>();
        for (Contact contact : contacts) {
            hashTable.put(contact.getName(), contact.getNumberOfPhone());
        }

        System.out.print("Введите имя контакта, по котормоу хотите узнать номер телефона: ");
        String name = in.next();
        System.out.println(hashTable.get(name));
        System.out.print("Поиск по имени и номеру телефона в телефонном справочнике!\nВведите имя: ");
        name = in.next();
        System.out.print("Введите номер телефона: ");
        String number = in.next();
        if (hashTable.Search(name, number)) {
            System.out.println("Такие данные существуют в телефонном справочнике");
        }
        else {
            System.out.println("Ошибка! Данные не найдены!");
        }
        System.out.print("Удаление из телефонного справочника!\nВведите имя: ");
        name = in.next();
        System.out.print("Введите номер телефона: ");
        number = in.next();
        hashTable.remove(name, number);
        System.out.println("Контакт удалён!");

        // Хэш-мэп Джавы
        HashMap <String, String> hashMap = new HashMap<>();
        for (Contact contact : contacts) {
            hashMap.put(contact.getName(), contact.getNumberOfPhone());
        }
        System.out.print("Введите имя контакта, по котормоу хотите узнать номер телефона: ");
        name = in.next();
        System.out.println(hashMap.get(name));
        System.out.print("Поиск по имени в телефонном справочнике!\nВведите имя: ");
        name = in.next();
        if (hashMap.containsKey(name)) {
            System.out.println("Такие данные существуют в телефонном справочнике");
        }
        else {
            System.out.println("Ошибка! Данные не найдены!");
        }
        System.out.print("Удаление из телефонного справочника!\nВведите имя: ");
        name = in.next();
        System.out.print("Введите номер телефона: ");
        number = in.next();
        hashTable.remove(name, number);
        System.out.println("Контакт удалён!");
    }
}
