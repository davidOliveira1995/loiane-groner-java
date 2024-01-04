package br.com.loianegroner.basico;

import java.util.Scanner;

//Faça um Programa que converta metros para centímetros.
public class ex05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int metros, centimetros;

        System.out.println("Digite o valor em metros: ");
        metros = scan.nextInt();

        centimetros = metros * 100;

        System.out.println(metros + "m é igual a: " + centimetros + "cm.");
    }
}
