package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <Integer> buffer = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            buffer.add(i);
        }
        Random random = new Random();



        System.out.print("Выберете вариант: ");
        int choice = in.nextInt();
        in.skip("\n");
        System.out.println("Для продолжения игры нажимайте Enter");

        switch (choice) {
            case 1:
                Stack <Integer> first = new Stack<>();
                Stack <Integer> second = new Stack<>();
                for (int i = 0; i < 10; i += 2) {
                    first.push(buffer.remove(random.nextInt(10 - i)));
                    second.push(buffer.remove(random.nextInt(10 - (i + 1))));

                }
                System.out.print("Карты первого игрока: ");
                for (int i = 0; i < first.size(); i++) {
                    System.out.print(first.get(i));
                }
                System.out.println("");
                System.out.print("Карты второго игрока: ");
                for (int i = 0; i < second.size(); i++) {
                    System.out.print(second.get(i));
                }
                System.out.println("");

                int count = 0;
                while (!first.isEmpty() && !second.isEmpty() && count != 106) {
                    in.nextLine();
                    System.out.println("Карта первого: " + first.peek() + ", карта второго: " + second.peek());
                    if ((first.peek() > second.peek()) || (first.peek() == 0 && second.peek() == 9)) {
                        System.out.println("У первого игрока карта больше!");
                        first.add(0, first.pop());
                        first.add(0, second.pop());
                    } else if ((first.peek() < second.peek()) || (first.peek() == 9 && second.peek() == 0)){
                        System.out.println("У второго игрока карта больше!");
                        second.add(0, first.pop());
                        second.add(0, second.pop());
                    }
                    count++;
                }
                if(count != 106) {
                    if (first.isEmpty()) {
                        System.out.println("Выиграл второй игрок! Было сделано " + count + " ходов!");
                    } else {
                        System.out.println("Выиграл первый игрок! Было сделано " + count + " ходов!");
                    }
                } else {
                    System.out.println("Ничья! Было сделано 106 ходов!");
                }
                break;
            case 2:
                Queue <Integer> first_2 = new LinkedList <>();
                Queue <Integer> second_2 = new LinkedList <>();

                for (int i = 0; i < 10; i += 2) {
                    first_2.offer(buffer.remove(random.nextInt(10 - i)));
                    second_2.offer(buffer.remove(random.nextInt(10 - (i + 1))));
                }

                int count_2 = 0;
                while (!first_2.isEmpty() && !second_2.isEmpty() && count_2 != 106) {
                    in.nextLine();
                    System.out.println("Карта первого: " + first_2.peek() + ", карта второго: " + second_2.peek());
                    if ((first_2.peek() > second_2.peek()) || (first_2.peek() == 0 && second_2.peek() == 9)) {
                        System.out.println("У первого игрока карта больше!");
                        first_2.offer(first_2.poll());
                        first_2.offer(second_2.poll());
                    } else if ((first_2.peek() < second_2.peek()) || (first_2.peek() == 9 && second_2.peek() == 0)){
                        System.out.println("У второго игрока карта больше!");
                        second_2.add(first_2.poll());
                        second_2.add(second_2.poll());
                    }
                    count_2++;
                }
                if(count_2 != 106) {
                    if (first_2.isEmpty()) {
                        System.out.println("Выиграл второй игрок! Было сделано " + count_2 + " ходов!");
                    } else {
                        System.out.println("Выиграл первый игрок! Было сделано " + count_2 + " ходов!");
                    }
                } else {
                    System.out.println("Ничья! Было сделано 106 ходов!");
                }
                break;
            case 3:
                Deque <Integer> first_3 = new LinkedList <>();
                Deque <Integer> second_3 = new LinkedList <>();
                for (int i = 0; i < 10; i += 2) {
                    first_3.offerLast(buffer.remove(random.nextInt(10 - i)));
                    second_3.offerLast(buffer.remove(random.nextInt(10 - (i + 1))));
                }

                int count_3 = 0;
                while (!first_3.isEmpty() && !second_3.isEmpty() && count_3 != 106) {
                    in.nextLine();
                    System.out.println("Карта первого: " + first_3.peekLast() + ", карта второго: " + second_3.peekLast());
                    if ((first_3.peekLast() > second_3.peekLast()) || (first_3.peekLast() == 0 && second_3.peekLast() == 9)) {
                        System.out.println("У первого игрока карта больше!");
                        first_3.offerFirst(first_3.pollLast());
                        first_3.offerFirst(second_3.pollLast());
                    } else if ((first_3.peekLast() < second_3.peekLast()) || (first_3.peekLast() == 9 && second_3.peekLast() == 0)){
                        System.out.println("У второго игрока карта больше!");
                        second_3.offerFirst(first_3.pollLast());
                        second_3.offerFirst(second_3.pollLast());
                    }
                    count_3++;
                }
                if(count_3 != 106) {
                    if (first_3.isEmpty()) {
                        System.out.println("Выиграл второй игрок! Было сделано " + count_3 + " ходов!");
                    } else {
                        System.out.println("Выиграл первый игрок! Было сделано " + count_3 + " ходов!");
                    }
                } else {
                    System.out.println("Ничья! Было сделано 106 ходов!");
                }
                break;
            case 4:
                ArrayList <Double> first_4 = new ArrayList<>();
                ArrayList <Double> second_4 = new ArrayList<>();

                for (int i = 0; i < 10; i += 2) {
                    first_4.add((double) buffer.remove(random.nextInt(10 - i)));
                    second_4.add((double) buffer.remove(random.nextInt(10 - (i + 1))));

                }

                int count_4 = 0;
                while (!first_4.isEmpty() && !second_4.isEmpty() && count_4 != 106) {
                    in.nextLine();
                    System.out.println("Карта первого: " + first_4.get(0) + ", карта второго: " + second_4.get(0));
                    if ((first_4.get(0) > second_4.get(0)) || (first_4.get(0) == 0 && second_4.get(0) == 9)) {
                        System.out.println("У первого игрока карта больше!");
                        first_4.add(first_4.remove(0));
                        first_4.add(second_4.remove(0));
                    } else if ((first_4.get(0) < second_4.get(0)) || (first_4.get(0) == 9 && second_4.get(0) == 0)){
                        System.out.println("У второго игрока карта больше!");
                        second_4.add(first_4.remove(0));
                        second_4.add(second_4.remove(0));
                    }
                    count_4++;
                }
                if(count_4 != 106) {
                    if (first_4.isEmpty()) {
                        System.out.println("Выиграл второй игрок! Было сделано " + count_4 + " ходов!");
                    } else {
                        System.out.println("Выиграл первый игрок! Было сделано " + count_4 + " ходов!");
                    }
                } else {
                    System.out.println("Ничья! Было сделано 106 ходов!");
                }
                break;
            default:
                break;
        }
    }
}
