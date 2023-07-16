package br.com.supera.desafio1;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos números você deseja digitar ?");
        int number = Integer.parseInt(scan.next());
        int[] meuArray = new int[number];
       if (number > 0) {
          for (int i = 0; i < number; i++) {
              System.out.println("Digite o " + (i+1)+  "º" + " número: ");
                meuArray[i] = Integer.parseInt(scan.next());
            }
        }
        Arrays.sort(meuArray);
        for (int i = 0; i < number; i++) {
            if(meuArray[i] % 2 == 0 ){
                System.out.println(meuArray[i]);
            }
        }
        for (int i = 0; i < number; i++) {
            if(meuArray[i] % 2 == 1 ){
                System.out.println(meuArray[i]);
            }
        }
}
}


