package org.example;

import java.util.Scanner;

public class Main {

<<<<<<< feature/dados-do-cardapio
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

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
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
        }
        System.out.println(opcao);
=======
    static void main() {
        Scanner scanner = new Scanner(System.in);


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

                case 2:

                case 3:

                case 4:

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
            }

        } while (opcao != 0);
>>>>>>> develop
    }
}

