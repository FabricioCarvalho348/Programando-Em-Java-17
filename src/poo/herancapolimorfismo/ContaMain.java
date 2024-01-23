package poo.herancapolimorfismo;

public abstract class ContaMain {
    private int agencia;
    private int numero;
    private ClienteMain titular;
    private double saldo;
    private static int total;


    public ContaMain(int agencia, int numero, ClienteMain titular) {
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;

        ContaMain.total++;
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

    public void transferir(double valor, ContaMain destino) {
        boolean conseguiuSacar = this.sacar(valor);

        if(conseguiuSacar) {
            destino.depositar(valor);
        }
    }

    public abstract void gerarExtrato();

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ClienteMain getTitular() {
        return titular;
    }

    public void setTitular(ClienteMain titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaMain{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", titular=" + titular +
                ", saldo=" + saldo +
                '}';
    }
}
