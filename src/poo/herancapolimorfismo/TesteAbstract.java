package poo.herancapolimorfismo;

public class TesteAbstract {

    public static void main(String[] args) {
        ClienteMain pedro = new ClienteMain("pedro", "999999999");
        ContaCorrente contaCorrente = new ContaCorrente(5643, 10032, pedro);
        ContaPoupanca contaPoupanca = new ContaPoupanca(5643, 10032, pedro);

        contaCorrente.gerarExtrato();
        contaPoupanca.gerarExtrato();
    }
}
