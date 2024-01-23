package poo.aula5;

import poo.aula1_primeiraclasse.Conta;

public class MetodoSacar {

    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.depositar(300);
        conta.depositar(500);
        conta.depositar(50.3);

        boolean conseguiuRealizarSaque = conta.sacar(1000);
        if(conseguiuRealizarSaque) {
            System.out.println("Saque realizado com sucesso!");
        } else{
            System.out.println("não foi possivel realizar o saque.");
        }

        System.out.println(conta.saldo);
    }
}
