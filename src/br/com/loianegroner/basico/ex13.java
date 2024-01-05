package br.com.loianegroner.basico;

import java.util.Scanner;

//.Tendo como dados de entrada a altura e o sexo de uma pessoa,
//construa um algoritmo que calcule seu peso ideal, utilizando as
//seguintes fórmulas:
//. Para homens: (72.7*h) - 58
//a. Para mulheres: (62.1*h) - 44.7 (h = altura)
//b. Peça o peso da pessoa e informe se ela está dentro, acima ou
//abaixo do peso.
public class ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sexo, comparacao;
        double altura, pesoIdeal = 0, peso;

        System.out.println("Digite sua altura: ");
        altura = scan.nextDouble();

        System.out.println("Digite seu peso: ");
        peso = scan.nextDouble();

        scan.nextLine();

        System.out.println("Digite o sexo, 'F' - Feminino ou 'M' - Masculino");
        sexo = scan.nextLine();

        switch (sexo) {
            case "f":
            case "F":
                pesoIdeal = (62.1 * altura) - 44.7;
                break;
            case "m":
            case "M":
                pesoIdeal = (72.7 * altura) - 58;
                break;
            default:
                System.out.println("Sexo, Invalido!");
                break;
        }

        if (pesoIdeal > peso) {
            comparacao = "Você está abaixo do peso!";
        } else {
            comparacao = "Você está acima do peso!";
        }

        System.out.println("Peso Ideal: " + pesoIdeal + " " + comparacao);
    }
}
