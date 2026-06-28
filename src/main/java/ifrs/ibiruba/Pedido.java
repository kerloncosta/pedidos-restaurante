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

    public String getNameClient() {return nameClient;}

    public Pedido(String nameClient){
        this.nameClient = nameClient;
        this. itens = new ArrayList<>();

        LocalDate now = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.issueDate = now.format(dtf);

        Random rand = new Random();
        this.noteNumber = "#" + String.format("%04d", rand.nextInt(1500) + 1);
    }
}

