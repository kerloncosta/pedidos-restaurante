package ifrs.ibiruba;

public class Lanche extends ItemCardapio{

    public Lanche(String name, double price, String category) {
        super(name, price, category);
    }

    @Override
    public double calculateFinalPrice() {
        return 0;
    }
}
