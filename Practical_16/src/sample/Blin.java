package sample;

public final class Blin implements Product {
    private final int price = 75;
    private final String name = "Блин со сгущенкой";
    private final int count;

    @Override
    public int getCount() {
        return count;
    }

    public Blin(int count) {
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
