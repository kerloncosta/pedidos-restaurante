package ifrs.ibiruba;

public abstract class ItemCardapio {
    private String name;
    private double price;
    private String category;

    public ItemCardapio(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {return name;}
    public double getPrice() {return price;}
    public String getCategory() {return category;}

    public abstract  double calculateFinalPrice();
}
