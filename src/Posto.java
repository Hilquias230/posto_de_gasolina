import java.util.Scanner;

public class Posto {
    static Scanner scanner = new Scanner(System.in);
    static int litrosGasolina;
    static int litrosAlcool;
    static double total;


    void gasolina() {
        System.out.println("--GASOLINA--");
        System.out.println("Valor da gasolina: 6,17 R$");
        System.out.println("Diga quanto queres litro: ");
        litrosGasolina = scanner.nextInt();
        total += litrosGasolina * 6.17;
    }

    void alcool() {
        System.out.println("--ÁLCOOL--");
        System.out.println("Valor do álcool: 4,23 R$");
        System.out.println("Diga quanto queres litro: ");
        litrosAlcool = scanner.nextInt();
        total += litrosAlcool * 4.23;
    }

    void conveniencia() {
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

    void exibir() {
        System.out.println("O VALOR TOTAL DEU " + total + " R$");
    }
}
