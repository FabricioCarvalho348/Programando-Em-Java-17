package poo.herancapolimorfismo;

public class ContaCorrente extends ContaMain {

    public ContaCorrente(int agencia, int numero, ClienteMain titular) {
        super(agencia, numero, titular);
    }

    @Override
    public boolean sacar(double valor) {
        double novoValor = valor + 2;
        return super.sacar(novoValor);
    }

    @Override
    public void gerarExtrato() {
        System.out.println("Gerando extrato conta corrente.");
    }
}
