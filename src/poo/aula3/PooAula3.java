package poo.aula3;

import poo.aula1_primeiraclasse.Conta;

public class PooAula3 {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 1525.40;
        primeiraConta.agencia = 1;
        primeiraConta.numero = 100;
//        primeiraConta.titular = "Pedro Henrique";

        System.out.println("O titular da primeira conta é: " + primeiraConta.titular);
        System.out.println("Agência " + primeiraConta.agencia + ", Número: " + primeiraConta.numero);
        System.out.println("O saldo atual é: " + primeiraConta.saldo);

    }
}

