package sample;

public final class Kruassan implements Product {
    private int price = 60;
    private String name = "Круассан";
    private int count;

    @Override
    public int getCount() {
        return count;
    }

    public Kruassan(int count) {
        this.count = count;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

}
