package br.com.loianegroner.basico;

import java.util.Scanner;

//Faça um Programa que peça dois números e imprima a soma.
public class ex03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numberOne = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        int numberTwo = scan.nextInt();

        int soma;

        soma = numberOne + numberTwo;

        System.out.println("A soma entre, " + numberOne + " e " + numberTwo
        + " é igual a: " + soma);
    }
}
