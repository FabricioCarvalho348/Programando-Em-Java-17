package poo.encapsulamento;

public class TestaEncapsulamento {

    public static void main(String[] args) {
        ContaTest contaTeste = new ContaTest();

        contaTeste.depositar(1000);
        contaTeste.sacar(300);

        contaTeste.setSaldo(-300);

        System.out.println(contaTeste.getSaldo());

        

    }

}
