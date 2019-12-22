package sample;

public final class Shaurma implements Product {
    private final int price = 120;
    private final String name = "Шаурма 1шт";
    private final int count;

    @Override
    public int getCount() {
        return count;
    }

    public Shaurma(int count) {
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
