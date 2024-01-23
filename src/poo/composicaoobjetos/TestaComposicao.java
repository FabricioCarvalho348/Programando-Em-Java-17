package poo.composicaoobjetos;

import poo.aula1_primeiraclasse.Conta;

public class TestaComposicao {

    public static void main(String[] args) {
        Cliente clientePedro = new Cliente();

        clientePedro.nome = "Pedro";
        clientePedro.cpf = "281487238";
        clientePedro.profissao = "Desenvolvedor";
        clientePedro.salario = 4.000;

        Conta conta = new Conta();
        conta.titular = clientePedro;

        System.out.println(conta.titular);
        System.out.println(clientePedro);
        System.out.println(conta.titular.nome);
        System.out.println(conta.titular.cpf);
        System.out.println(conta.titular.profissao);
    }
}
