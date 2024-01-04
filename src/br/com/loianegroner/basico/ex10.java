package br.com.loianegroner.basico;

import java.util.Scanner;

// Faça um Programa que peça a temperatura em graus Celsius,
//transforme e mostre em graus Farenheit
public class ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double celsius, farenheit;

        System.out.println("Digite a temperatura em Celsius:");
        celsius = scan.nextDouble();

        farenheit = ((celsius * 9) / 5) + 32;

        System.out.println("A temperatura em farenheit é: " + farenheit + " F°.");
    }
}
