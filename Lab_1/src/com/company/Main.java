package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        System.out.print("Выберете вариант: ");
        choice = in.nextInt();
        switch (choice){
            case 1:
                int SIZE;
                double sum = 0;
                System.out.print("Введите количество элементов в массиве: ");
                SIZE = in.nextInt();
                double[] array = new double[SIZE];
                for (int i = 0; i < SIZE; i++) {
                    System.out.print("Введите " + (i + 1) + " элемент массива: ");
                    array[i] = in.nextDouble();
                }

                //подсчет суммы с помощью for
                for (int i = 0; i < SIZE; i++) {
                    sum += array[i];
                }
                System.out.println("Сумма с помощью цикла for = " + sum);

                //подсчет суммы с помощью while
                sum = 0;
                int  count = 0;
                while (count != SIZE){
                    sum += array[count];
                    count++;
                }
                System.out.println("Сумма с помощью цикла while = " + sum);

                //подсчет суммы с помощью do while
                sum = 0;
                count = 0;
                do {
                    sum += array[count];
                    count++;
                } while (count != SIZE);
                System.out.println("Сумма с помощью цикла do while = " + sum);
                break;

            case 2:
                for (int i = 0; i < args.length; i++){
                    System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
                }
                break;

            case 3:
                System.out.println("Первые 10 чисел гармонического ряда:");
                double counter = 1;
                while (counter != 11){
                    System.out.println(counter + ": " + 1/counter);
                    counter++;
                }
                break;

            case 4:
                int N;
                System.out.print("Введите количество элементов в массиве: ");
                N = in.nextInt();
                int[] array_rand = new int[N];
                Random rand = new Random();
                //рандомная генерация массива целых чисел и вывод на эркан
                for(int i = 0; i < N; i++) {
                    array_rand[i] = rand.nextInt(20);
                    System.out.println((i + 1) + " элемент массива: " + array_rand[i]);
                }

                //сортировка массива
                int buffer;
                for (int i = 0; i < N; i++) {            // i - номер прохода
                    for (int j = N - 1; j > i; j--) {     // внутренний цикл прохода
                        if (array_rand[j - 1] > array_rand[j]) {
                            buffer = array_rand[j - 1];
                            array_rand[j - 1] = array_rand[j];
                            array_rand[j] = buffer;
                        }
                    }
                }

                //вывод массива
                System.out.println("\nОтсортированный массив:");
                for (int i = 0; i < N; i++) {
                    System.out.println((i + 1) + " элемент массива: " + array_rand[i]);
                }
                break;

            case 5:
                System.out.println("Вычислене факториала");
                System.out.print("Введите число: ");
                int digit = in.nextInt();
                int factor = 1;
                for (int i = 1; i <= digit; i++)
                    factor*=i;
                System.out.println("Факториал числа " + digit + " = " + factor);

                break;

            default:
                System.out.println("Ошибка выбора");
        }
    }
}
