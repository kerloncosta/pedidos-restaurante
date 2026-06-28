package ifrs.ibiruba;

import java.util.ArrayList;
import java.util.Scanner;

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
                    System.out.println("Saindo...\n");
                    break;

                case 1:

                    break;

                case 2:
                    System.out.println("Informe seu nome para buscarmos seu pedidos:");
                        keyboard.nextLine();
                         String nameClient = keyboard.nextLine();

                         boolean exists = false;
                    System.out.println("Histórico de pedidos do(a): " + nameClient + "\n");

                        for (Pedido p : pedidos) {
                            if (p.getNameClient().equals(nameClient)) {
                                    p.printSummary();
                                exists = true;
                            }
                        }
                    if (!exists) {
                        System.out.println("Não a nenhum pedido no nome de " + nameClient + "\n");
                    }

                    break;

                default:
                    System.out.println("A opção selecionada é inválida!!! \n");
                    break;
            }
        }while(option != 0);
    }
}
