package sample;

public final class Nagets implements Product {
    private int price = 100;
    private String name = "Нагетсы";
    private int count;

    @Override
    public int getCount() {
        return count;
    }

    public Nagets(int count) {
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
