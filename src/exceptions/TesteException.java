package exceptions;

public class TesteException {

    public static void main(String[] args) {

        try {
            int resultado = 10 / 2;
            System.out.println("O resultado da divisão é: " + resultado);

            Cliente cliente = new Cliente("Pedro", "899999999");
            Conta conta = new Conta(3242, 8732, cliente);
            conta.depositar(1000);
            conta.sacar(1002);

            System.out.println("O saldo da minha conta é: " + conta.getSaldo());
        } catch (RuntimeException ex) {
            System.out.println("O motivo do erro foi: " + ex.getMessage());
        } finally {
            System.out.println("Esse bloco sempre será executado.");
        }

        System.out.println("Opa! agora eu sou chamado!");
    }
}
