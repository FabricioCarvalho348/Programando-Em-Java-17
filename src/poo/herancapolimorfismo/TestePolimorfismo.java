package poo.herancapolimorfismo;

public class TestePolimorfismo {

    public static void main(String[] args) {
        ClienteMain pedro = new ClienteMain("pedro", "99999999999");
        ContaCorrente contaCorrente = new ContaCorrente(5643, 10032, pedro);
        ContaPoupanca contaPoupanca = new ContaPoupanca(5643, 10032, pedro);

        contaCorrente.depositar(1000);
        contaPoupanca.depositar(10000);

        contaCorrente.sacar(100);
        contaPoupanca.sacar(1000);

        contaPoupanca.transferir(500, contaCorrente);
        contaCorrente.transferir(100, contaPoupanca);

        System.out.println("Saldo Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo Conta Poupança: " + contaPoupanca.getSaldo());

        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);
    }
}
