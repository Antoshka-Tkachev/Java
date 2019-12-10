package com.company;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер задания: ");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                SimpleDateFormat sdf = new SimpleDateFormat("EEEE dd.MM.yyyy 'и время' hh:mm:ss a");
                Person person = new Person();
                in.skip("\n");
                System.out.print("Введите имя: ");
                person.setName(in.nextLine());
                System.out.print("Введите фамилию: ");
                person.setSurname(in.nextLine());
                System.out.print("Для выдачи задания нажмите Enter... ");
                in.nextLine();
                Date dateOfIssue = new Date();
                System.out.print("Для сдачи задания нажмите Enter... ");
                in.nextLine();
                Date dateOfCompletion = new Date();
                System.out.println(person.toString());
                System.out.println("Дата выдачи задания: " + sdf.format(dateOfIssue.getTime()));
                System.out.println("Дата сдачи задания: " + sdf.format(dateOfCompletion.getTime()));
                break;
            case 2:
                SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
                int day;
                int mounth;
                int year;
                System.out.print("Введите число: ");
                day = in.nextInt();
                System.out.print("Введите номер месяца: ");
                mounth = in.nextInt();
                System.out.print("Введите год: ");
                year = in.nextInt();
                Calendar inputDate = new GregorianCalendar(year, mounth - 1, day);
                Calendar thisDate = new GregorianCalendar();

                if (inputDate.after(thisDate)) {
                    System.out.println("Введенная вами дата " + format.format(inputDate.getTime())+ " будет позже сегодняшней " + format.format(thisDate.getTime()));
                } else {
                    System.out.println("Введенная вами дата " + format.format(inputDate.getTime()) + " была раньше сегодняшней " + format.format(thisDate.getTime()));
                }
                break;
            case 3:
                in.skip("\n");
                System.out.print("Введите число: ");
                int dd = in.nextInt();
                System.out.print("Введите номер месяца: ");
                int MM = in.nextInt();
                System.out.print("Введите год: ");
                int yyyy = in.nextInt();
                System.out.print("Введите часы: ");
                int hh = in.nextInt();
                System.out.print("Введите минуты: ");
                int mm = in.nextInt();
                String strDate = dd + "." + MM + "." + yyyy + " " + hh + ":" + mm;
                SimpleDateFormat form = new SimpleDateFormat("dd.MM.yyyy hh:mm");
                Date date1 = form.parse(strDate);
                Calendar calendar = new GregorianCalendar(yyyy, MM - 1 , dd, hh, mm);
                System.out.println("Date: " + form.format(date1.getTime()));
                System.out.println("Calendar: " + form.format(calendar.getTime()));
                break;
            case 4:
                ArrayList<Integer>  arrayList = new ArrayList<>();
                LinkedList<Integer> linkedList = new LinkedList<>();
                for (int i = 0; i < 100000; i++) {
                    arrayList.add(i);
                    linkedList.add(i);
                }


                Date start = new Date();
                for (int i = 0; i < 100000; i++) {
                    linkedList.get(i);
                }
                Date  finish = new Date();
                long linkedListTime = finish.getTime() - start.getTime();

                start = new Date();
                for (int i = 0; i < 100000; i++) {
                    arrayList.get(i);
                }
                finish = new Date();
                long arrayListTime = finish.getTime() - start.getTime();


                System.out.println("Операция обращение по индексу\n" +
                        "ArrayList: " + arrayListTime +
                        "\nLinkedList: " + linkedListTime);



                start = new Date();
                for (int i = 0; i < 50000; i++) {
                    linkedList.add(i, 5);
                }
                finish = new Date();
                linkedListTime = finish.getTime() - start.getTime();

                start = new Date();
                for (int i = 0; i < 50000; i++) {
                    arrayList.add(i, 5);
                }
                finish = new Date();
                arrayListTime = finish.getTime() - start.getTime();


                System.out.println("Операция вставки в середину массива\n" +
                        "ArrayList: " + arrayListTime +
                        "\nLinkedList: " + linkedListTime);



                start = new Date();
                for (int i = 0; i < 50000; i++) {
                    linkedList.remove(25000);
                }
                finish = new Date();
                linkedListTime = finish.getTime() - start.getTime();

                start = new Date();
                for (int i = 0; i < 50000; i++) {
                    arrayList.remove(25000);
                }
                finish = new Date();
                arrayListTime = finish.getTime() - start.getTime();


                System.out.println("Операция удаления элемента из середины массива\n" +
                        "ArrayList: " + arrayListTime +
                        "\nLinkedList: " + linkedListTime);





                start = new Date();
                for (int i = 0; i < 5000; i++) {
                    linkedList.indexOf(99999);
                }
                finish = new Date();
                linkedListTime = finish.getTime() - start.getTime();

                start = new Date();
                for (int i = 0; i < 5000; i++) {
                    arrayList.indexOf(99999);
                }
                finish = new Date();
                arrayListTime = finish.getTime() - start.getTime();


                System.out.println("Операция поиска элемента по индексу\n" +
                        "ArrayList: " + arrayListTime +
                        "\nLinkedList: " + linkedListTime);
                break;
        }

    }
}
