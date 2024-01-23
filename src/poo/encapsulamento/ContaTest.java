package poo.encapsulamento;

import poo.aula1_primeiraclasse.Conta;
import poo.composicaoobjetos.Cliente;

public class ContaTest {

    private int agencia;
    private int numero;
    private Cliente titular;
    private double saldo;

    public ContaTest() {

    }

    public ContaTest(int agencia, int numero, Cliente titular, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

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

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia > 0) {
            this.agencia = agencia;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
