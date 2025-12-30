package br.com.hilquias.main;


import br.com.hilquias.domain.Account;
import br.com.hilquias.domain.Station;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Station station = new Station();
        String username;
        int passowrd;
        byte option;

        System.out.println("--POSTO DE GASOLINA--");
        System.out.println("NOME: ");
        username = scanner.next();
        System.out.println("SENHA: ");
        passowrd = scanner.nextInt();

        Account account = new Account(username, passowrd);

        while (true) {
            System.out.println("--BEM-VINDO(A)");
            System.out.println("1 - GASOLINA");
            System.out.println("2 - ÁLCOOL");
            System.out.println("3 - LOJA DE CONVENIÊNCIA");
            System.out.println("4 - EXIBIR VALOR TOTAL");
            System.out.println("5 - EXIBIR O PERFIL");
            System.out.println("0 - SAIR");
            System.out.println("Escolha uma das opções:");
            option = scanner.nextByte();

            switch (option) {
                case 0 -> System.exit(0);
                case 1 -> station.gasoline();
                case 2 -> station.alcohol();
                case 3 -> station.convenience();
                case 4 -> station.display();
                case 5 -> System.out.println(account);
            }

        }


    }
}
