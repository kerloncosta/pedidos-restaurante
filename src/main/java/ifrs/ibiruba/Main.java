package ifrs.ibiruba;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pedido> pedidos = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        Cardapio menu = new Cardapio();

        int option, re = -1;
        boolean isReturnable = false;
        boolean returnedBottle = false;

        do {
            try {
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
                        System.out.println("Informe seu nome:");
                        keyboard.nextLine();
                        String name = keyboard.nextLine();

                        Pedido p = new Pedido(name);
                        System.out.println();
                        menu.showMenu();

                        System.out.println("Para escolher algo do cardápio informe o número do Item!");
                        System.out.println("Para Cancelar o pedido pressione [0]");
                        boolean cancel = false;

                        do {
                            System.out.println("Qual seu pedido: ");
                            int ip = keyboard.nextInt();

                            if (ip == 0) {
                                System.out.println("Pedido cancelado!");
                                cancel = true;
                                break;

                            } else if (menu.getItem(ip) != null) {

                                ItemCardapio item = menu.getItem(ip);

                                if (item instanceof Lanche l) {

                                    if (l.getCategory().equals("Xis")) {
                                        Lanche planche = new Lanche(l.getName(), l.getPrice(), l.getCategory());

                                        System.out.println("Quantas unidades você deseja?");
                                        int qtd = keyboard.nextInt();

                                        p.addItem(planche, qtd);
                                        System.out.println(qtd + "x " + l.getName() + " adicionado(s) ao carrinho!");

                                    } else {
                                        String size = "M";

                                        System.out.println("Qual o tamanho desejado?");
                                        System.out.println("[1] - Pequeno (P) custa R$ " + (l.getPrice() - 5));
                                        System.out.println("[2] - Médio (M) custa R$ " + l.getPrice());
                                        System.out.println("[3] - Grande (G) custa R$ " + (l.getPrice() + 10));
                                        int sizeOption = keyboard.nextInt();

                                        while (sizeOption < 1 || sizeOption > 3) {
                                            System.out.println("Resposta inválida!");
                                            System.out.println("Selecione [1] para Pequeno, [2] para Médio ou [3] para Grande:");
                                            sizeOption = keyboard.nextInt();

                                        }

                                        if (sizeOption == 1) {
                                            size = "P";
                                        } else if (sizeOption == 3) {
                                            size = "G";
                                        }

                                        Lanche planche = new Lanche(l.getName(), l.getPrice(), size, l.getCategory());

                                        System.out.println("Quantas unidades você deseja?");
                                        int qtd = keyboard.nextInt();

                                        p.addItem(planche, qtd);
                                        System.out.println(qtd + "x " + l.getName() + " adicionado(s) ao carrinho!");

                                    }
                                } else if (item instanceof Bebida b) {

                                    if (b.getCategory().equals("Alcoólica")) {
                                        returnedBottle = false;

                                        if (b.isReturnable()) {
                                            System.out.println("Você possui o casco vazio para devolver? \n [1] - sim    [2] - não");
                                            int optionBottle = keyboard.nextInt();

                                            while (optionBottle != 1 && optionBottle != 2) {
                                                System.out.println("Resposta inválida!");
                                                System.out.println("Selecione [1] ou [2]!!!");
                                                optionBottle = keyboard.nextInt();
                                            }

                                            if (optionBottle == 1) {
                                                returnedBottle = true;
                                            }
                                        }

                                        Bebida pbebida = new Bebida(b.getName(), b.getPrice(), b.getCategory(), b.getSubcategory(), "", b.isReturnable(), returnedBottle);

                                        System.out.println("Quantas unidades você deseja?");
                                        int qtd = keyboard.nextInt();

                                        p.addItem(pbebida, qtd);
                                        System.out.println(qtd + "x " + b.getName() + " adicionado(s) ao carrinho!");

                                    } else if (b.getCategory().equals("Sem álcool") && b.getSubcategory().equals("Refri")) {
                                        keyboard.nextLine();

                                        System.out.println("Qual refrigerante você deseja?");
                                        String flavor = keyboard.nextLine();

                                        isReturnable = false;
                                        returnedBottle = false;

                                        if (b.getName().equals("Refrigerante 1L") || b.getName().equals("Refrigerante 2L")) {
                                            System.out.println("Para este tamanho, temos duas opções de embalagem.");
                                            System.out.println("Qual você prefere? [1] Retornável / [2] Garrafa Pet");
                                            int typeBottle = keyboard.nextInt();

                                            while (typeBottle != 1 && typeBottle != 2) {
                                                System.out.println("Resposta inválida! Selecione [1] Retornável ou [2] Descartável:");
                                                typeBottle = keyboard.nextInt();
                                            }

                                            if (typeBottle == 1) {
                                                isReturnable = true;

                                                System.out.println("Você tem o casco vazio para devolver agora? [1] Sim / [2] Não");
                                                int optionBottle = keyboard.nextInt();


                                                while (optionBottle != 1 && optionBottle != 2) {
                                                    System.out.println("Resposta inválida! Selecione [1] Sim ou [2] Não:");
                                                    optionBottle = keyboard.nextInt();
                                                }

                                                if (optionBottle == 1) {
                                                    returnedBottle = true;
                                                }
                                            }
                                        }

                                        Bebida pbebida = new Bebida(b.getName(), b.getPrice(), b.getCategory(), b.getSubcategory(), flavor, isReturnable, returnedBottle);

                                        System.out.println("Quantas unidades você deseja?");
                                        int qtd = keyboard.nextInt();

                                        p.addItem(pbebida, qtd);
                                        System.out.println(qtd + "x " + b.getName() + " adicionado(s) ao carrinho!");

                                    } else {
                                        System.out.println("Quantas unidades você deseja?");
                                        int qtd = keyboard.nextInt();

                                        p.addItem(b, qtd);
                                        System.out.println(qtd + "x " + b.getName() + " adicionado(s) ao carrinho!");

                                    }
                                }
                            } else {
                                System.out.println("O item informado não faz parte do nosso menu!!!");
                            }

                            System.out.println("Gostaria de pedir mais alguma coisa");
                            System.out.println("[1] - sim    [2] - não");
                            re = keyboard.nextInt();

                            while (re != 1 && re != 2) {
                                System.out.println("Resposta invalida! Selecione [1] ou [2]");
                                re = keyboard.nextInt();
                            }

                        } while (re != 2);

                        if (!cancel) {
                            pedidos.add(p);
                            p.printSummary();
                        }
                        break;

                    case 2:
                        System.out.println("Informe seu nome para buscarmos seu pedidos:");
                        keyboard.nextLine();
                        String nameClient = keyboard.nextLine();

                        boolean exists = false;
                        System.out.println("Histórico de pedidos do(a): " + nameClient + "\n");

                        for (Pedido pe : pedidos) {
                            if (pe.getNameClient().equals(nameClient)) {
                                pe.printSummary();
                                System.out.println("\n");
                                exists = true;
                            }
                        }
                        if (!exists) {
                            System.out.println("Não há nenhum pedido no nome de " + nameClient + "\n");
                        }

                        break;

                    default:
                        System.out.println("A opção selecionada é inválida!!! \n");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("\n[ERRO] - Entrada inválida! Por favor, digite apenas números.");
                keyboard.nextLine();
                option = -1;

            }
        } while (option != 0);
    }
}
