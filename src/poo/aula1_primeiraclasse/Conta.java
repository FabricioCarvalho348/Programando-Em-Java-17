package poo.aula1_primeiraclasse;

import poo.composicaoobjetos.Cliente;

public class Conta {

    public int agencia;
    public int numero;
    public Cliente titular;
    public double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if(saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public void transferir(double valor, Conta destino) {
        boolean conseguiuSacar = this.sacar(valor);

        if(conseguiuSacar) {
            destino.depositar(valor);
        }
    }
}
