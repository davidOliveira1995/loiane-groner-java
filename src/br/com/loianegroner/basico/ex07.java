package br.com.loianegroner.basico;

import java.util.Scanner;

//Faça um Programa que calcule a área de um quadrado, em seguida
//mostre o dobro desta área para o usuário.
public class ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int area, lado;

        System.out.println("O lado do quadrado é: ");
        lado = scan.nextInt();

        area = lado * lado;

        System.out.println("O dobro do quadrado é: " + (area * 2));
    }
}
