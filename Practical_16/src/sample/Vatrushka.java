package sample;

public final class Vatrushka implements Product {
    private int price = 50;
    private String name = "Ватрушка";
    private int count;

    @Override
    public int getCount() {
        return count;
    }

    public Vatrushka(int count) {
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
