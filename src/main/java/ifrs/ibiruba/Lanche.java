package ifrs.ibiruba;

public class Lanche extends ItemCardapio{
    private String size = "U";

    public String getSize() {return size;}

    public Lanche(String name, double price, String size, String category) {
        super(name, price, category);
        this.size = size;
    }

    public Lanche(String name, double price, String category) {
        super(name, price, category);
    }

    @Override
    public double calculateFinalPrice() {
        double finalPrice = super.getPrice();

        if("G".equalsIgnoreCase(size)){
            finalPrice += 10.00;
        }else if("P".equalsIgnoreCase(size)){
            finalPrice -= 5;
        }

        return finalPrice;
    }

    @Override
    public String toString() {
        return getName() + " (" + this.size + ") - R$ " +
                String.format("%.2f", calculateFinalPrice());
    }
}
