package br.com.hilquias.domain;

import java.util.Scanner;

public class Station {
    static Scanner scanner = new Scanner(System.in);
    private double total;

    public void gasoline() {
        System.out.println("--GASOLINA--");
        System.out.println("Valor da gasolina: 6,17 R$");
        System.out.println("Diga quanto queres litro: ");
        int litersGasoline = scanner.nextInt();
        total += litersGasoline * 6.17;
    }

    public void alcohol() {
        System.out.println("--ÁLCOOL--");
        System.out.println("Valor do álcool: 4,23 R$");
        System.out.println("Diga quanto queres litro: ");
        int litersAlcohol = scanner.nextInt();
        total += litersAlcohol * 4.23;
    }

    public void convenience() {
        System.out.println("--LOJA DE CONVENIÊNCIA--");
        System.out.println("1 - SALGADINH0");
        System.out.println("2 - GELO");
        System.out.println("3 - REFRIGERANTE");
        System.out.println("4 - CARVÃO");
        int option = scanner.nextInt();

        switch (option) {
            case 1 -> total += 2.00;
            case 2 -> total += 3.50;
            case 3 -> total += 6.35;
            case 4 -> total += 7.00;
        }
    }

    public void display() {
        System.out.println("----TOTAL----");
        System.out.println("O VALOR TOTAL DEU " + total + " R$");
        System.out.println("----------------");
    }

}
