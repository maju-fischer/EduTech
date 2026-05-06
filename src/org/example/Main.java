package org.example;

import java.util.Scanner;

public class Main {

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
    }
}

