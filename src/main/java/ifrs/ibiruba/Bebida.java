package ifrs.ibiruba;

public class Bebida extends ItemCardapio{

    public Bebida(String name, double price, String category) {
        super(name, price, category);
    }

    @Override
    public double calculateFinalPrice() {
        return 0;
    }
}
