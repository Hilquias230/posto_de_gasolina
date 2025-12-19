package br.com.hilquias.main;


import br.com.hilquias.domain.Posto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Posto posto = new Posto();
        String login;
        int passowrd;
        byte option;

        System.out.println("--POSTO DE GASOLINA--");
        System.out.println("LOGIN: ");
        login = scanner.next();
        System.out.println("SENHA: ");
        passowrd = scanner.nextInt();

        while (true) {
            System.out.printf("--Bem-vindo(a) %s-- \n", login);
            System.out.println("1 - GASOLINA");
            System.out.println("2 - ÁLCOOL");
            System.out.println("3 - LOJA DE CONVENIÊNCIA");
            System.out.println("4 - EXIBIR VALOR TOTAL");
            System.out.println("0 - SAIR");
            System.out.println("Escolha uma das opções:");
            option = scanner.nextByte();

            switch (option) {
                case 0 -> System.exit(0);
                case 1 -> posto.gasolina();
                case 2 -> posto.alcool();
                case 3 -> posto.conveniencia();
                case 4 -> posto.exibir();
            }

        }


    }
}
