package br.com.loianegroner.basico;

import java.util.Scanner;

// Faça um Programa que peça a temperatura em graus Farenheit,
//transforme e mostre a temperatura em graus Celsius.
//o C = (5 * (F-32) / 9).
public class ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double farenheit, celsius;

        System.out.println("Digite o valor da temperatura em Farenheit: ");
        farenheit = scan.nextDouble();

        celsius = (5 * (farenheit - 32) / 9);

        System.out.println("A temperatura em Celcius é: " + celsius + " F°");
    }
}
