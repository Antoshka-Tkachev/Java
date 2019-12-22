package sample;

public final class Free implements Product {
    private final int price = 75;
    private final String name = "Картошка фри";
    private final int count;

    @Override
    public int getCount() {
        return count;
    }

    public Free(int count) {
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
