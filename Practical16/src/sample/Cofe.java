package sample;

public final class Cofe implements Product {
    private int price = 70;
    private String name = "Кофе";
    private int count;

    @Override
    public int getCount() {
        return count;
    }

    public Cofe(int count) {
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
