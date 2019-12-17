package sample;

public final class Pirozhok implements Product {
    private int price = 55;
    private String name = "Пирожок с яблоком";
    private int count;

    @Override
    public int getCount() {
        return count;
    }

    public Pirozhok(int count) {
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
