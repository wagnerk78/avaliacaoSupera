package br.com.supera.desafio4;

import java.util.Scanner;

public class Desafio4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantas mensagens você quer decifrar ?");
        int quantidade = Integer.parseInt(scan.next());
        String teste = null;
        if (quantidade > 0) {
            for (int i = 0; i < quantidade; i++) {
                System.out.println("Digite a " + (i + 1) + "ª" + " mensagem: ");
                teste = scan.nextLine();
            }

        }
        int n=0;
        n = teste.length();
        for (int i = n/2 - 1; i > -1 ; i--) {
            System.out.print(teste.charAt(i));
        }
        for (int i = n-1; i > n/2 - 1 ; i--) {
            System.out.print(teste.charAt(i));
        }


    }
    }

