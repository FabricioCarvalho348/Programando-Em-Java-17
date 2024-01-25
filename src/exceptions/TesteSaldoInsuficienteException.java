package exceptions;

public class TesteSaldoInsuficienteException {

    public static void main(String[] args) {
        Cliente pedro = new Cliente("Pedro", "99999999");
        Conta conta = new Conta(9231, 8273, pedro);

        conta.depositar(500);
        conta.sacar(700);
    }
}
