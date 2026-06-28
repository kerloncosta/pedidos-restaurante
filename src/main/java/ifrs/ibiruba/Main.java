package ifrs.ibiruba;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        ArrayList<Pedido> pedidos = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        Cardapio menu = new Cardapio();

        int option, re = -1;
        boolean isReturnable = false;
        boolean returnedBottle = false;

        do {
            System.out.println("0 - Sair");
            System.out.println("1 - Fazer Pedido");
            System.out.println("2 - Conferir últimos Pedidos");
            System.out.print("Escolha uma opção: ");
            option = keyboard.nextInt();

            switch (option) {

                case 0:
                    System.out.println("Saindo...");
                    break;

                case 1:

                    break;

                case 2:

                    break;

                default:

                    break;
            }
        }while(option != 0);
    }
}
