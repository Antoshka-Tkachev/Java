package sample;

import java.util.ArrayList;
import java.util.List;

public class Logic {
    static private String name;
    static private List<Product> order = new ArrayList<>();
    static private boolean flag = false;

    public static boolean isFlag() {
        return flag;
    }

    public static void setFlag(boolean flag) {
        Logic.flag = flag;
    }

    public static int size() {
        return order.size();
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Logic.name = name;
    }

    public static Product getOrderElement(int i) {
        return order.get(i);
    }

    public static void addOrderElement(Product product) {
        Logic.order.add(product);
    }
}
