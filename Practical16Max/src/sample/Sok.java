package sample;

public final class Sok implements Product {
    private int price = 85;
    private String name = "Сок 1л";
    private int count;

    @Override
    public int getCount() {
        return count;
    }

    public Sok(int count) {
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
