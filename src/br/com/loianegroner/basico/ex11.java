package br.com.loianegroner.basico;

import java.util.Scanner;

//.Faça um Programa que peça 2 números inteiros e um número real.
//Calcule e mostre:
//a. o produto do dobro do primeiro com metade do segundo .
//b. a soma do triplo do primeiro com o terceiro.
//c. o terceiro elevado ao cubo.
public class ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeroUm, numeroDois, A;
        double numeroTres, B, C;

        System.out.println("Digite o 1° numero inteiro: ");
        numeroUm = scan.nextInt();

        System.out.println("Digite o 2° numero inteiro: ");
        numeroDois = scan.nextInt();

        System.out.println("Digite o 3° numero real: ");
        numeroTres = scan.nextDouble();

        A = (numeroUm * 2) + numeroDois / 2;
        B = (numeroUm * 3) + numeroTres;
        C = Math.pow(numeroTres, 3);

        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
    }
}
