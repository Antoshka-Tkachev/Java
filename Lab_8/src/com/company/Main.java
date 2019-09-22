package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {
    //PrintWriter нельзя дописывать в файл
    //FileWriter из методички

    //FileReader из методички нельзя считывать строками
    //BufferedReader

    public static void main(String[] args) {

//            if (!file.exists()) { //создание файла
//                file.createNewFile();
//            }

        Scanner in = new Scanner(System.in);
        System.out.print("1. Перезапись файла\n2. Дозапись в конец файла\n3. Чтение из файла\nВведите выбранный вариант: ");
        int choice = in.nextInt();
        File file = new File("NewFile.txt");
        switch (choice) {
            case 1:
                try {
                    FileWriter writer = new FileWriter(file, false);
                    in.skip("\n");
                    System.out.print("Введите сообщение: ");
                    String buffer = in.nextLine();
                    writer.write( buffer + "\n");
                    writer.close();
                    System.out.println("Файл успешно перезаписан!");
                } catch (IOException e) {
                    System.out.println("Error" + e);
                }
                break;
            case 2:
                try {
                    FileWriter writer = new FileWriter(file, true);
                    in.skip("\n");
                    System.out.print("Введите сообщение: ");
                    String buffer = in.nextLine();
                    writer.write(buffer + "\n");
                    writer.close();
                    System.out.println("Данные успешно дозаписаны в конец файла !");
                } catch (IOException e) {
                    System.out.println("Error" + e);
                }
                break;
            case 3:
                try {
                    BufferedReader reader = new BufferedReader(new FileReader("NewFile.txt"));
                    String line_buffer;
                    System.out.println("Данные из файла: ");
                    while ((line_buffer = reader.readLine()) != null) {
                        System.out.println(line_buffer);
                    }
                } catch (IOException e) {
                    System.out.println("Error" + e);
                }
                break;
            default:
                break;
        }
    }
}
