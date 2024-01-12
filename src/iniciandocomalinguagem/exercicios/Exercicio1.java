package iniciandocomalinguagem.exercicios;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        // Faça um programa que recebe como entrada um valor que representa uma
        // temperatura em graus Celsius e imprime esse valor convertido em
        // Kelvin e Fahrenheit.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma temperatura em graus celsius.");
        double temperaturaCelsius = scanner.nextDouble();

        double kelvin = temperaturaCelsius + 273.15;
        double fahrenheit = temperaturaCelsius + 1.8 + 32;

        System.out.println("A temperatura em Kelvin é " + kelvin);
        System.out.println("A temperatura em Fahrenheit é " + fahrenheit);

    }
}
