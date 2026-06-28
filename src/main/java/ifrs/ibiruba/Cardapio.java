package ifrs.ibiruba;

import java.util.Map;
import java.util.TreeMap;

public class Cardapio {
    private Map<Integer, ItemCardapio> itens;

    public Cardapio() {itens = new TreeMap<Integer, ItemCardapio>();
        loadMenu();
    }

    public void addItens(int code, ItemCardapio item){
        itens.put(code, item);
    }

    public ItemCardapio getItens(int code){
        return itens.get(code);
    }

    public void showMenu(){
        System.out.println("\n|================= Cardápio ================|");

        for (Map.Entry<Integer, ItemCardapio> item : itens.entrySet()) {
            System.out.println("| " + item.getKey() + " - " + item.getValue());
        }

        System.out.println("|=============================================|");
    }

    private void loadMenu(){

        addItens(1, new Lanche("Xis Salada", 22.00, "Xis"));
        addItens(2, new Lanche("Xis Frango", 24.00, "Xis"));
        addItens(3, new Lanche("Xis Entreveiro", 28.00, "Xis"));
        addItens(4, new Lanche("Xis Bacon", 26.00, "Xis"));
        addItens(5, new Lanche("Xis Especial", 26.00, "Xis"));

        addItens(6, new Lanche("Pizza de Calabresa", 38.00, "Pizza"));
        addItens(7, new Lanche("Pizza de Quatro Queijos", 42.00, "Pizza"));
        addItens(8, new Lanche("Pizza de Strogonoff", 35.00, "Pizza"));
        addItens(9, new Lanche("Pizza de Coração", 44.00, "Pizza"));
        addItens(10, new Lanche("Pizza de Chocolate", 40.00, "Pizza"));

        addItens(11, new Lanche("Batata Frita Simples", 18.00, "Porções"));
        addItens(12, new Lanche("Batata Frita c/ Catupiry", 22.00, "Porções"));
        addItens(13, new Lanche("Polenta Frita", 16.00, "Porções"));
        addItens(14, new Lanche("Anéis de Cebola", 19.00, "Porções"));
        addItens(15, new Lanche("Frango a Passarinho", 29.00, "Porções"));

        addItens(16, new Bebida("Água Mineral Natural", 2.50, "Sem álcool", "Água"));
        addItens(17, new Bebida("Água Mineral com Gás", 3.00, "Sem álcool", "Água"));
        addItens(18, new Bebida("Refrigerante Lata", 4.50, "Sem álcool", "Refri", "", false, false));
        addItens(19, new Bebida("Refrigerante 1L", 8.00, "Sem álcool", "Refri", "", true, false));
        addItens(20, new Bebida("Refrigerante 2L", 10.00, "Sem álcool", "Refri", "", true, false));
        addItens(21, new Bebida("Cerveja Polar 600ml", 14.00, "Alcoólica", "Cerveja", "", true, false));
        addItens(22, new Bebida("Cerveja Brahma 600ml", 13.00, "Alcoólica", "Cerveja", "", true, false));
        addItens(23, new Bebida("Heineken Long Neck", 12.00, "Alcoólica", "Cerveja", "", false, false));
        addItens(24, new Bebida("Skol Litrão", 16.00, "Alcoólica", "Cerveja", "", true, false));
        addItens(25, new Bebida("Torre de Chopp 2,5L", 85.00, "Alcoólica", "Chopp", "", false, false));
    }
}
