package ifrs.ibiruba;

import java.util.Map;
import java.util.TreeMap;

public class Cardapio {
    private Map<Integer, ItemCardapio> itens;

    public Cardapio() {
        itens = new TreeMap<Integer, ItemCardapio>();
        loadMenu();
    }

    public void addItem(int code, ItemCardapio item) {
        itens.put(code, item);
    }

    public ItemCardapio getItem(int code) {
        return itens.get(code);
    }

    public void showMenu() {
        System.out.println("\n|================= Cardápio ================|");

        for (Map.Entry<Integer, ItemCardapio> item : itens.entrySet()) {
            System.out.println("| " + item.getKey() + " - " + item.getValue());
        }

        System.out.println("|=============================================|");
    }

    private void loadMenu() {

        addItem(1, new Lanche("Xis Salada", 22.00, "Xis"));
        addItem(2, new Lanche("Xis Frango", 24.00, "Xis"));
        addItem(3, new Lanche("Xis Entreveiro", 28.00, "Xis"));
        addItem(4, new Lanche("Xis Bacon", 26.00, "Xis"));
        addItem(5, new Lanche("Xis Especial", 26.00, "Xis"));

        addItem(6, new Lanche("Pizza de Calabresa", 40.00, "Pizza"));
        addItem(7, new Lanche("Pizza de Quatro Queijos", 42.00, "Pizza"));
        addItem(8, new Lanche("Pizza de Strogonoff", 42.00, "Pizza"));
        addItem(9, new Lanche("Pizza de Coração", 44.00, "Pizza"));
        addItem(10, new Lanche("Pizza de Chocolate", 45.00, "Pizza"));

        addItem(11, new Lanche("Batata Frita Simples", 18.00, "Porções"));
        addItem(12, new Lanche("Batata Frita c/ Catupiry", 22.00, "Porções"));
        addItem(13, new Lanche("Polenta Frita", 16.00, "Porções"));
        addItem(14, new Lanche("Anéis de Cebola", 19.00, "Porções"));
        addItem(15, new Lanche("Frango a Passarinho", 29.00, "Porções"));

        addItem(16, new Bebida("Água Mineral Natural", 2.50, "Sem álcool", "Água"));
        addItem(17, new Bebida("Água Mineral com Gás", 3.00, "Sem álcool", "Água"));
        addItem(18, new Bebida("Refrigerante Lata", 4.50, "Sem álcool", "Refri", "", false, false));
        addItem(19, new Bebida("Refrigerante 1L", 8.00, "Sem álcool", "Refri", "", true, false));
        addItem(20, new Bebida("Refrigerante 2L", 10.00, "Sem álcool", "Refri", "", true, false));
        addItem(21, new Bebida("Cerveja Polar 600ml", 14.00, "Alcoólica", "Cerveja", "", true, false));
        addItem(22, new Bebida("Cerveja Brahma 600ml", 13.00, "Alcoólica", "Cerveja", "", true, false));
        addItem(23, new Bebida("Heineken Long Neck", 12.00, "Alcoólica", "Cerveja", "", false, false));
        addItem(24, new Bebida("Skol Litrão", 16.00, "Alcoólica", "Cerveja", "", true, false));
        addItem(25, new Bebida("Torre de Chopp 2,5L", 85.00, "Alcoólica", "Chopp", "", false, false));
    }
}
