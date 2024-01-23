package poo.aula2;

import poo.aula1_primeiraclasse.Conta;

public class TestaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 1525.40;

        Conta segundaConta = new Conta();
        segundaConta.saldo = 500;

        System.out.println(primeiraConta.saldo);
        System.out.println(segundaConta.saldo);

        System.out.println(primeiraConta.agencia);
        System.out.println(segundaConta.agencia);

        System.out.println(primeiraConta.numero);
        System.out.println(segundaConta.numero);

        System.out.println(primeiraConta.titular);

    }
}
