package br.com.loianegroner.basico;

import java.util.Scanner;

//Faça um Programa que peça as 4 notas bimestrais e mostre a média
public class ex04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double notas[] = new double[4];

        double total = 0, media = 0;
        for(int i = 0; i <= 3; i++) {
            System.out.println("Digite a nota do " + (i+1) + "º Bimestre: ");
            notas[i] = scan.nextDouble();

            total += notas[i];
        }

        media = total / 4;

        System.out.println("A média é: " + media);
    }
}
