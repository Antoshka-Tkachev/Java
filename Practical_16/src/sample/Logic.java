package sample;

import java.util.ArrayList;
import java.util.List;

public class Logic {
    static private String name;
    static private String surname;
    static private List<Product> order = new ArrayList<>();
    static private String comment;

    public static int size() {
        return order.size();
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Logic.name = name;
    }

    public static String getSurname() {
        return surname;
    }

    public static void setSurname(String surname) {
        Logic.surname = surname;
    }

    public static String getComment() {
        return comment;
    }

    public static void setComment(String comment) {
        Logic.comment = comment;
    }

    public static Product getOrderElement(int i) {
        return order.get(i);
    }

    public static void addOrderElement(Product product) {
        Logic.order.add(product);
    }
}
