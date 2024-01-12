package iniciandocomalinguagem.escopovariaveis;

public class EscopoVariaveis {

    public static void main(String[] args) {
        // Duas variáveis no mesmo escopo da erro!
        // double salario;
        // int salario;

        if(true) {
            double salario = 1550.25;
            System.out.println("O salário é: " + salario);
        } else {
            int salario;
        }
        double salario = 1000;
        System.out.println("O salário é: " + salario);
        System.out.println("Testando execução");
    }
}
