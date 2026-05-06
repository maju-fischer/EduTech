package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = {
                "ByteBurger Clássico",
                "ByteBurger Duplo",
                "Batata Frita P",
                "Batata Frita G",
                "Refrigerante Lata",
                "Suco Natural",
                "Água"
        };

        String[] categorias = {
                "Lanche", "Lanche",
                "Acompanhamento", "Acompanhamento",
                "Bebida", "Bebida", "Bebida"
        };

        double[] precos = {
                22.90, 29.90, 12.00, 18.00, 7.00, 10.00, 4.00
        };

        int opcao;
        do {
            System.out.println("\n==============================");
            System.out.println("      BYTEBURGER SYSTEM");
            System.out.println("==============================");
            System.out.println("1- Novo Pedido");
            System.out.println("2- Consultar Cardápio por Categoria");
            System.out.println("3- Calcular Troco");
            System.out.println("4- Sorteio do Dia");
            System.out.println("0- Encerrar");
            System.out.println("Selecione uma opção");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Digite o seu nome: ");
                    String cliente = scanner.nextLine();

                    double total = 0;
                    String continuar;

                    ArrayList<Integer> itens = new ArrayList<>();
                    do {
                        System.out.println("\n====== Cardapio ======");
                        for (int i = 0; i < nomes.length; i++) {
                            System.out.println((i + 1) + " - " + nomes[i] + " | R$ " + precos[i]);
                        }
                        int codigo;

                        while (true) {
                            System.out.print("Digite o código do item: ");

                            while (!scanner.hasNextInt()) {
                                System.out.println("Digite um número válido:");
                                scanner.next();
                            }

                            codigo = scanner.nextInt();

                            if (codigo >= 1 && codigo <= nomes.length) {
                                break;
                            }

                            System.out.println("Código inválido!");
                        }

                        total += precos[codigo - 1];
                        itens.add(codigo - 1);
                        System.out.println(nomes[codigo - 1] + " adicionado!");

                        System.out.print("\nAdicionar mais itens? (s/n)\n");

                        do {
                            continuar = scanner.next().toLowerCase();

                            if (!continuar.equals("s") && !continuar.equals("n")) {
                                System.out.println("Digite apenas 's' ou 'n'");
                            }

                        } while (!continuar.equals("s") && !continuar.equals("n"));

                    } while (continuar.equalsIgnoreCase("s"));

                    System.out.println("Cliente: " + cliente);
                    System.out.println("Itens:");
                    for (int i : itens) {
                        System.out.printf("- %s R$ %.2f\n", nomes[i], precos[i]);
                    }
                    System.out.printf("Total a pagar: R$ %.2f\n", total);
                    break;
                case 2:
                    System.out.println("\n====== Escolha a Categoria ======");
                    System.out.println("1 - Lanches");
                    System.out.println("2 - Acompanhamentos");
                    System.out.println("3 - Bebidas");
                    System.out.println("Escolha: ");

                    while (!scanner.hasNextInt()) {
                        System.out.println("Digite um número válido:");
                        scanner.next();
                    }
                    int escolha = scanner.nextInt();

                    if (escolha < 1 || escolha > 3) {
                        System.out.println("Opção inválida!");
                        break;
                    }

                    String filtro = "";

                    switch (escolha) {
                        case 1:
                            filtro = "Lanche";
                            break;
                        case 2:
                            filtro = "Acompanhamento";
                            break;
                        case 3:
                            filtro = "Bebida";
                            break;
                        default:
                            System.out.println("Opção inválida!");
                            break;
                    }

                    for (int i = 0; i < nomes.length; i++) {
                        if (categorias[i].equalsIgnoreCase(filtro)) {
                            System.out.println(nomes[i] + " | R$ " + precos[i]);
                        }
                    }
                    break;
                case 3:


                    double valorTotal;
                    double valorPago;

                    System.out.print("Digite o valor total da compra: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Digite um valor válido:");
                        scanner.next();
                    }
                    valorTotal = scanner.nextDouble();

                    if (valorTotal <= 0) {
                        System.out.println("Valor deve ser maior que zero!");
                        break;
                    }

                    do {
                        System.out.print("Digite o valor pago pelo cliente: ");

                        while (!scanner.hasNextDouble()) {
                            System.out.println("Digite um valor válido:");
                            scanner.next();
                        }

                        valorPago = scanner.nextDouble();

                        if (valorPago <= 0) {
                            System.out.println("Valor inválido!");
                        } else if (valorPago < valorTotal) {
                            System.out.println("Valor insuficiente!");
                        }

                    } while (valorPago <= 0 || valorPago < valorTotal);

                    double troco = valorPago - valorTotal;
                    System.out.printf("Troco a devolver: R$ %.2f\n", troco);
                    break;

                case 4:

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
            }

        } while (opcao != 0);
    }
}

