package br.com.loianegroner.basico;

import java.util.Scanner;

//Faça um Programa que peça o raio de um círculo, calcule e mostre
//sua área.
public class ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double area = 0, pi, raio;

        pi = 3.14159;

        System.out.println("Digite o raio do circulo: ");
        raio = scan.nextDouble();

        area = pi * Math.pow(raio,2);

        System.out.println("O valor é: " + area);
    }
}
