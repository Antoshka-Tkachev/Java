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
            case 4:
                //Вывод чисел от 1 до n
                System.out.print("Введите число: ");
                System.out.println(Order(in.nextInt()));
                break;
            case 5:
                //Треугольная последовательность
                System.out.print("Введите число: ");
                Triangle(in.nextInt());
                break;
            default:
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
        if (n != 0) {
            int m = in.nextInt();
            if (m != 0) {
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
                if (k != 0) {
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

    public static String Order(int n) {
        if (n == 1) {
            return "1";
        }
        return Order(n - 1) + " " + n;
    }

    public static String Triangle(int n) {
        int sum = 0;
        int j = 0;
        // Базовый случай
        if (n == 1) {
            System.out.print("1");
        } else {
            for (int i = 1; sum < n; i++) {
                sum += i;
                j = i;
            }
            // Шаг рекурсии / рекурсивное условие
            System.out.print(Triangle(--n) + " " + j);
        }
        return "";
    }
}