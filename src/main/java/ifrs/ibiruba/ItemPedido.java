package ifrs.ibiruba;

public class ItemPedido {
    private ItemCardapio item;
    private int amount;

    public ItemPedido(ItemCardapio item, int amount) {
        this.item = item;
        this.amount = amount;
    }

    public double calculateSubtotal() {
        return item.calculateFinalPrice() * amount;
    }

    @Override
    public String toString() {
        return amount + "x " + item.toString() + " = Subtotal: " + String.format("%.2f", calculateSubtotal());
    }
}
