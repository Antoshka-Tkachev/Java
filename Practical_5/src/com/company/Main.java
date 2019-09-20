package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите вариант: ");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                //переворот числа
                System.out.print("Введите число: ");
                int digit = in.nextInt();
                System.out.println("Развернутое число: " + Reverse(digit));
                break;
            case 2:
                //Количество единичек
                System.out.println(One());
                break;
            case 3:
                //Вывести нечетные числа последовательности
                System.out.println("Введите последовательность чисел, заканчивающиюся нулем: ");
                String output = "";
                Odd(output);
                break;
        }
    }

    private static int Back(int digit, int buff) {
        if (digit != 0) {
            return Back(digit / 10, (buff * 10) + (digit % 10));
        }

        return buff;
    }

    private static int Reverse(int digit) {
        return Back(digit, 0);
    }

    public static int One() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай 
        if (n != 0) {
            int m = in.nextInt();
            // Базовый случай 
            if (m != 0) {
                // Шаг рекурсии / рекурсивное условие
                if (n == 1 || m == 1) {
                    if (n == m) {
                        return  One() + 2;
                    }
                    else {
                        return One() + 1;
                    }
                } else {
                    return One();
                }
            } else {
                int k = in.nextInt();
                // Базовый случай 
                if (k != 0) {
                    // Шаг рекурсии / рекурсивное условие
                    if (k == 1 || n == 1) {
                        if (k == n) {
                            return One() + 2;
                        } else {
                            return One() + 1;
                        }
                    } else {
                        return One();
                    }
                } else {
                    if (n == 1) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
            }
        } else {
            int m = in.nextInt();
            // Базовый случай 
            if (m != 0) {
                if (m == 1) {
                    return One() + 1;
                } else {
                    return One();
                }
            } else {
                return 0;
            }
        }
    }

    public static void Odd(String output) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n != 0) {
            if (n % 2 == 1) {
                output += n;
                Odd(output);
            } else {
                Odd(output);
            }
        } else {
            System.out.println("Нечетные числа в введенной последовательности: " + output);
        }
    }
    
}