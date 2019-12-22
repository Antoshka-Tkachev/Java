package sample;

public final class Shashlik implements Product {
    private int price = 100;
    private String name = "Шашлык 100гр";
    private int count;

    @Override
    public int getCount() {
        return count;
    }

    public Shashlik(int count) {
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
