package br.com.supera.desafio2;

import java.util.Scanner;

import static java.lang.Float.parseFloat;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o valor você deseja decompor ?");
        Double number = (double) parseFloat(scan.next());
        int cont100 = 0;
        int cont50 = 0;
        int cont20 = 0;
        int cont10 = 0;
        int cont5 = 0;
        int cont2 = 0;
        int cont1 = 0;
        int cont050 = 0;
        int cont025 = 0;
        int cont010 = 0;
        int cont005 = 0;
        int cont001 = 0;
        while (number >= 100) {
            number = number - 100;
            cont100++;
        }
        while (number >= 50) {
            number = number - 50;
            cont50++;
        }
        while (number >= 20) {
            number = number - 20;
            cont20++;
        }
        while (number >= 10) {
            number = number - 10;
            cont10++;
        }
        while (number >= 5) {
            number = number - 5;
            cont5++;
        }
        while (number >= 2) {
            number = number - 2;
            cont2++;
        }
        while (number >= 1) {
            number = number - 1;
            cont1++;
        }
        while (number >= 0.50) {
            number = number - 0.50;
            cont050++;
        }
        while (number >= 0.25) {
            number = number - 0.25;
            cont025++;
        }
        while (number >= 0.10) {
            number = number - 0.10;
            cont010++;
        }
        while (number >= 0.05) {
            number = number - 0.05;
            cont005++;
        }
        while (number > 0.00) {
            number = number - 0.01;
            cont001++;
        }
        System.out.println("NOTAS: ");
        System.out.println(cont100 + "  nota(s) de R$ 100.00");
        System.out.println(cont50 + "  nota(s) de R$ 50.00");
        System.out.println(cont20 + "  nota(s) de R$ 20.00");
        System.out.println(cont10 + "  nota(s) de R$ 10.00");
        System.out.println(cont5 + "  nota(s) de R$ 5.00");
        System.out.println(cont2 + "  nota(s) de R$ 2.00");
        System.out.println("MOEDAS: ");
        System.out.println(cont1 + "  moeda(s) de R$ 1.00");
        System.out.println(cont050 + "  moeda(s) de R$ 0.50");
        System.out.println(cont025 + "  moeda(s) de R$ 0.25");
        System.out.println(cont010 + "  moeda(s) de R$ 0.10");
        System.out.println(cont005 + "  moeda(s) de R$ 0.05");
        System.out.println(cont001 + "  moeda(s) de R$ 0.01");
    }
}
