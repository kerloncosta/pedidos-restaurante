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

    private void loadMenu(){

    }
}
