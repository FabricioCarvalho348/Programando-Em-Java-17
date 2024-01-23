package poo.aula6;

import poo.aula1_primeiraclasse.Conta;

public class MetodoTransferir {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        Conta segundaConta = new Conta();

        primeiraConta.depositar(1000);

        primeiraConta.transferir(500, segundaConta);

        System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
        System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
    }
}
