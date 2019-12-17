package sample;

public final class BigMac implements Product {
    private int price = 110;
    private String name = "Биг Мак";
    private int count;

    @Override
    public int getCount() {
        return count;
    }

    public BigMac(int count) {
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