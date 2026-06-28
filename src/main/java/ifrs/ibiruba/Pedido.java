package ifrs.ibiruba;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

public class Pedido {
    private String nameClient;
    private String issueDate;
    private String noteNumber;
    private ArrayList<ItemPedido> itens;

    public String getNameClient() {
        return nameClient;
    }

    public Pedido(String nameClient) {
        this.nameClient = nameClient;
        this.itens = new ArrayList<>();

        LocalDate now = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.issueDate = now.format(dtf);

        Random rand = new Random();
        this.noteNumber = "#" + String.format("%04d", rand.nextInt(1500) + 1);
    }

    public void addItem(ItemCardapio item, int amount) {
        ItemPedido newItem = new ItemPedido(item, amount);
        itens.add(newItem);
    }

    public double calculateTotal() {
        double total = 0.0;

        for(ItemPedido item : itens){
            total += item.calculateSubtotal();
        }

        return total;
    }

    public void printSummary() {
        System.out.println("--------------------------Resumo pedido--------------------------");
        System.out.println("N° Comanda: " + this.noteNumber + "   Data: " + this.issueDate + "   Cliente: " + this.nameClient);
        System.out.println("-----------------------------------------------------------------");

        for (ItemPedido it : itens) {
            System.out.println(it);
        }

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Total a pagar: R$ " + String.format("%.2f", calculateTotal()));
    }
}

