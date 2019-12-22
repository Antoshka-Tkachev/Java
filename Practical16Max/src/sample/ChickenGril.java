package sample;

public final class ChickenGril implements Product {
    private int price = 400;
    private String name = "Курица гриль 1кг";
    private int count;

    @Override
    public int getCount() {
        return count;
    }

    public ChickenGril(int count) {
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