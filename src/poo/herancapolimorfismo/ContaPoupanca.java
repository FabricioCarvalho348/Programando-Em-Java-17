package poo.herancapolimorfismo;

public class ContaPoupanca extends ContaMain {

    public ContaPoupanca(int agencia, int numero, ClienteMain titular) {
        super(agencia, numero, titular);
    }

    @Override
    public void gerarExtrato() {
        System.out.println("Gerando extrato conta poupança.");
    }
}
