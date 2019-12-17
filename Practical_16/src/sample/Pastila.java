package sample;

public final class Pastila implements Product {
    private int price = 30;
    private String name = "Пастила";
    private int count;

    @Override
    public int getCount() {
        return count;
    }

    public Pastila(int count) {
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