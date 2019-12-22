package sample;

public final class Steik implements Product {
    private int price = 200;
    private String name = "Стейк 100гр";
    private int count;

    @Override
    public int getCount() {
        return count;
    }

    public Steik(int count) {
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
