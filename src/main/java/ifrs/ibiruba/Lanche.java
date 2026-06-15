package ifrs.ibiruba;

public class Lanche extends ItemCardapio{
    private String size = "U";
    private boolean containsAdditional = false;

    public String getSize() {return size;}
    public boolean isContainsAdditional() {return containsAdditional;}

    public Lanche(String name, double price, String size, boolean containsAdditional, String category) {
        super(name, price, category);
        this.size = size;
        this.containsAdditional = containsAdditional;

    }

    public Lanche(String name, double price, String category) {
        super(name, price, category);
    }


    @Override
    public double calculateFinalPrice() {
        return 0;
    }
}
