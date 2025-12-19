package br.com.hilquias.domain;

import java.util.Scanner;

public class Posto {
    static Scanner scanner = new Scanner(System.in);
    private double total;

    public void gasolina() {
        System.out.println("--GASOLINA--");
        System.out.println("Valor da gasolina: 6,17 R$");
        System.out.println("Diga quanto queres litro: ");
        int litrosGasolina = scanner.nextInt();
        total += litrosGasolina * 6.17;
    }

    public void alcool() {
        System.out.println("--ÁLCOOL--");
        System.out.println("Valor do álcool: 4,23 R$");
        System.out.println("Diga quanto queres litro: ");
        int litrosAlcool = scanner.nextInt();
        total += litrosAlcool * 4.23;
    }

    public void conveniencia() {
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

    public void exibir() {
        System.out.println("O VALOR TOTAL DEU " + total + " R$");
    }

}
