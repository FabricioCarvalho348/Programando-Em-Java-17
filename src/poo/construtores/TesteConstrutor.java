package poo.construtores;

import poo.composicaoobjetos.Cliente;
import poo.encapsulamento.ContaTest;

public class TesteConstrutor {

    public static void main(String[] args) {
        ContaTest contaTeste2 = new ContaTest(2370, 100, new Cliente(), 2000);

        System.out.println(contaTeste2.getAgencia());
        System.out.println(contaTeste2.getNumero());
        System.out.println(contaTeste2.getTitular());

    }

}
