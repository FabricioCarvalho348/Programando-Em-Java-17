package iniciandocomalinguagem.condicionais;

public class EstruturaIfElse {

    public static void main(String[] args) {
        double media = 4.8;

        // se média for maior ou igual 7 = aprovado
        // se não se, média for maior ou igual a 5 = recuperação
        // se não, reprovado

        if(media >= 7) {
            System.out.println("Aprovado!");
        } else if (media >= 5) {
            System.out.println("recuperação :(");
        } else {
            System.out.println("reprovado :(");
        }
    }
}
