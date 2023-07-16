package br.com.supera.desafio3;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o valor alvo ?");
        int alvo = Integer.parseInt(scan.next());
        System.out.println("Quantos números terá em seu Array ?");
        int number = Integer.parseInt(scan.next());
        int[] meuArray = new int[number];
        if (number > 0) {
            for (int i = 0; i < number; i++) {
                System.out.println("Digite o " + (i + 1) + "º" + " número: ");
                meuArray[i] = Integer.parseInt(scan.next());
            }
        }
        int cont = 0;
        for (int i = 0; i < meuArray.length ; i++) {
            for (int j = i + 1; j < meuArray.length; j++) {
                int calculo = Math.abs(meuArray[i] - meuArray[j]);
                if(calculo == alvo){
                    cont++;
                }
            }

        }
        System.out.println("\n");
        System.out.println(cont);
        // System.out.println(Arrays.toString(meuArray));
    }
}
