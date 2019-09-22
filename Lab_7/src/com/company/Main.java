package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.print("Введите вариант: ");
	    int choice = in.nextInt();
	    switch (choice) {
            case 1:
                System.out.print("Введите размер массива: ");
                int size = in.nextInt();
                ArrayList <Integer> intArray = new ArrayList<>();
                System.out.println("Введите элементы массива: ");
                for(int i = 0; i < size; i++) {
                    intArray.add(in.nextInt());
                }
                System.out.print("Вывод массива: ");
                for(int i = 0; i < size; i++) {
                    System.out.print(intArray.get(i) + " ");
                }

                System.out.print("\nВведите индекс элемента, который хотите добавить: ");
                int index = in.nextInt();
                System.out.print("Введите элемент, который хотите добавить: ");
                int buffer = in.nextInt();
                intArray.add(index, buffer);

                System.out.print("Введите индекс элемента, который хотите изменить: ");
                index = in.nextInt();
                System.out.print("Введите элемент, на который хотите изменить: ");
                buffer = in.nextInt();
                intArray.set(index, buffer);

                System.out.print("Введите индекс элемента, который хотите удалить: ");
                index = in.nextInt();
                intArray.remove(index);

                System.out.print("Вывод массива: ");
                for(int i = 0; i < size; i++) {
                    System.out.print(intArray.get(i) + " ");
                }

                break;
            case 2:
                System.out.print("Введите размер массива: ");
                int length = in.nextInt();
                in.skip("\n");
                LinkedList <String>  stringArray= new LinkedList<>();
                System.out.println("Введите элементы массива: ");
                for(int i = 0; i < length; i++) {
                    stringArray.add(in.nextLine());
                }
                System.out.print("Вывод массива: ");
                for(int i = 0; i < length; i++) {
                    System.out.print(stringArray.get(i) + " ");
                }

                System.out.print("\nВведите индекс элемента, который хотите добавить: ");
                int iter = in.nextInt();
                in.skip("\n");
                System.out.print("Введите элемент, который хотите добавить: ");
                String str = in.nextLine();
                stringArray.add(iter, str);

                System.out.print("Введите индекс элемента, который хотите изменить: ");
                iter = in.nextInt();
                in.skip("\n");
                System.out.print("Введите элемент, на который хотите изменить: ");
                str = in.nextLine();
                stringArray.set(iter, str);

                System.out.print("Введите индекс элемента, который хотите удалить: ");
                iter = in.nextInt();
                in.skip("\n");
                stringArray.remove(iter);

                System.out.print("Введите элемент, на который добавить в начало: ");
                str = in.nextLine();
                stringArray.offerFirst(str);

                str = stringArray.peekLast();
                System.out.println("Удален элемент " + str + " с конца!");
                stringArray.pollLast();

                System.out.print("Вывод массива: ");
                for(int i = 0; i < length; i++) {
                    System.out.print(stringArray.get(i) + " ");
                }
                break;
            case 3:
                MyArrayList <Integer> list = new MyArrayList<>();
                list.add(0);
                list.add(1);
                list.add(2);
                list.add(3);
                list.add(4);
                list.add(5);
                list.remove(4);
                list.add(1, 555);
                list.set(5, 1234);
                System.out.println("Вывод массива:");
                for(int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));
                }

                System.out.println("\nИндекс искомого элемента: " + list.indexOf(1)); //555
                System.out.println("Элемент найден? " + list.contains(1));            //555

                System.out.println("Очищение массива!");
                list.clear();
                System.out.println("Массив пуст? " + list.isEmpty());
                System.out.println("Размер массива: " + list.size());
                System.out.println("Добавляем в массив элемент");
                list.add(333);
                System.out.println("Первый элемент массива: " + list.get(0));
                break;
            default:
                break;
        }
    }
}
