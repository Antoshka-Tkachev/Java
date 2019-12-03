package com.Bezuglyj;

import java.util.*;

public class Main {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Wait List:");
        IWaitList <String> waitList = new WaitList <> ();
        waitList.add("Настя");
        waitList.add(("Макс"));
        System.out.println(waitList.contains("Антон"));
        Collection <String> collection = new ArrayList <> ();
        collection.add("Настя");
        collection.add(("Макс"));
        System.out.println(waitList.containsAll(collection));

        System.out.println("\nBounded Wait List:");
        System.out.print("Введите количество человек в очереди: ");
        int numberPersons = in.nextInt();
        waitList = new BoundedWaitList <> (numberPersons);
        waitList.add("Настя");
        waitList.add("Алина");
        waitList.add("Макс");
        waitList.add("Антон");
        waitList.add("Вася");
        collection.removeAll(collection);
        collection.add("Настя");
        collection.add("Алина");
        collection.add("Макс");
        collection.add("Антон");
        System.out.println(waitList.containsAll(collection));

        System.out.println("\nUnfair Wait List:");
        UnfairWaitList <String> unfairWaitList = new UnfairWaitList <> ();
        unfairWaitList.add("Настя");
        unfairWaitList.add("Оксана");
        unfairWaitList.add("Макс");
        unfairWaitList.add("Вика");
        unfairWaitList.add("Макс");
        unfairWaitList.moveToBack("Оксана");
        System.out.println(unfairWaitList);
        unfairWaitList.remove("Оксана");
        System.out.println(unfairWaitList);
    }
}