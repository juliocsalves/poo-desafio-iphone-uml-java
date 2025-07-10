package edu.dio.iphone.model;

import java.util.Scanner;

import edu.dio.iphone.main.IPhone;

public class Main {
    public static void main(String[] args) {
        IPhone meuIphone = new IPhone();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== iPhone - Console Interativo ===");
            System.out.println("1 - Tocar música");
            System.out.println("2 - Ligar");
            System.out.println("3 - Navegar na internet");
            System.out.println("0 - Sair");
            System.out.print("Digite sua escolha: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    meuIphone.selecionarMusica();
                    meuIphone.tocar();
                    break;
                case 2:
                    meuIphone.ligar();
                    break;
                case 3:
                    meuIphone.exibirPagina();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }

}
