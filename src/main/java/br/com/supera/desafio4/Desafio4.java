package br.com.supera.desafio4;

import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de frases a serem decriptografadas: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        String[] frases = new String[quantidade];

        for (int i = 0; i < frases.length; i++) {
            System.out.print("Digite a frase " + (i + 1) + ": ");
            frases [i] = scanner.nextLine();
        }

        System.out.println("Frases descriptografadas:");

        for (String string : frases) {
            //System.out.println(string);

            int n = 0;
            n = string.length();
            for (int i = n/2 - 1; i > -1 ; i--) {
                System.out.print(string.charAt(i));
            }
            for (int i = n-1; i > n/2 - 1 ; i--) {
                System.out.print(string.charAt(i));
        }
            System.out.print("\n");


        }





    }
}
