package poo.herancapolimorfismo;

public class TestaHeranca{

    public static void main(String[] args) {
        ClienteMain pedro = new ClienteMain("Pedro", "99999999999");
        ContaCorrente contaCorrente = new ContaCorrente(1298, 8734, pedro);

        contaCorrente.depositar(1000);
        contaCorrente.sacar(233.76);

        ContaPoupanca contaPoupanca = new ContaPoupanca(1298, 4368, pedro);

        contaCorrente.transferir(500, contaPoupanca);

        System.out.println("O saldo da minha conta corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo conta poupança: " + contaPoupanca.getSaldo());


    }
}
