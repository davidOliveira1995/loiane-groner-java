package br.com.loianegroner.basico;

// Tendo como dados de entrada a altura de uma pessoa, construa um
//algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
//(72.7*altura) - 58

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double altura, pesoIdeal;

        System.out.println("Digite sua altura: ");
        altura = scan.nextDouble();

        pesoIdeal = (72.7 * altura) - 58;

        System.out.println("Peso ideal: " + pesoIdeal);
    }
}
