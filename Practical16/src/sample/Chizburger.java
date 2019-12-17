package sample;

public final class Chizburger implements Product {
    private int price = 50;
    private String name = "Чизбургер";
    private int count;

    @Override
    public int getCount() {
        return count;
    }

    public Chizburger(int count) {
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
