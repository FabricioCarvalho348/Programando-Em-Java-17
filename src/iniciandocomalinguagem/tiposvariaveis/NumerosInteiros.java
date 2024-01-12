package iniciandocomalinguagem.tiposvariaveis;

public class NumerosInteiros {

    public static void main(String[] args) {
        int idadePedro;
        idadePedro = 29;

        System.out.println("A idade do Pedro é " + idadePedro);

        int idadeAna = 25;
        System.out.println(idadeAna);

        // byte: 8 bits = -128 até 127
        // short: 16 bits = -32768 até 32767
        // int: 32 bits
        // long: 62 bits

        byte testaByte = 127;

        int testaExpressao = 10 * 5 + 50 + 24/2;

        System.out.println("O resultado da expressão é: " + testaExpressao);
    }
}
