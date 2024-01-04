package br.com.loianegroner.basico;

// Faça um Programa que pergunte quanto você ganha por hora e o
//número de horas trabalhadas no mês. Calcule e mostre o total do seu
//salário no referido mês.

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double valorHora, total;
        int horasTrabalhadas;

        System.out.println("Digite o valor da hora trabalhada: ");
        valorHora = scan.nextDouble();

        System.out.println("Digite as horas trabalhadas: ");
        horasTrabalhadas = scan.nextInt();

        total = horasTrabalhadas * valorHora;

        System.out.println("O valor total do salário é: R$ " + total);
    }
}
