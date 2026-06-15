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
        double finalPrice = super.getPrice();

        if (this.containsAdditional) {
            if ("G".equalsIgnoreCase(this.size)) {
                finalPrice += 7.00;
            } else if ("P".equalsIgnoreCase(this.size)) {
                finalPrice += 3.00;
            } else {
                finalPrice += 5.00;
            }
        }
        return finalPrice;
    }

    @Override
    public String toString() {

        String descricao = getName() + " (" + this.size + ")";

        if (this.containsAdditional) {
            descricao += " com cheddar e bacon";
        }

        descricao += " - R$ " + String.format("%.2f", calculateFinalPrice());

        return descricao;
    }
}
