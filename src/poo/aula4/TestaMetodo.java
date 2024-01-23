package poo.aula4;

import poo.aula1_primeiraclasse.Conta;

public class TestaMetodo {

    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.depositar(300);
        conta.depositar(500);
        conta.depositar(50.3);

        System.out.println(conta.saldo);
    }
}
