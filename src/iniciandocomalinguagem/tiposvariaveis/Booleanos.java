package iniciandocomalinguagem.tiposvariaveis;

public class Booleanos {

    public static void main(String[] args) {
        boolean usuarioAtivo = true;
        int idadePedro = 28;

        // Operadores De Igualdade
        // ==  idadePedro == 25 false
        // != idadePedro != 25 true

        // Operadores Relacionais
        // > idadePedro > 25 true
        // >= idadePedro >= 28 true
        // < idadePedro < 30 true
        // <= idadePedro <= 25 false


        // Operadores lógicos
        // &&    true && true = true // true && false = false

        // ||      false || true = true
        //          idadePedro == 25 || idadePedro == 28 true

        System.out.println(usuarioAtivo);
        System.out.println(idadePedro > 20);
        System.out.println(idadePedro == 30);

        System.out.println(usuarioAtivo == true && idadePedro < 30);
        System.out.println(usuarioAtivo == false && idadePedro == 28);

        Boolean usuarioAtivoMenorQue30 = usuarioAtivo == true && idadePedro < 30;
        System.out.println("Usuario está ativo e tem menos de 30 anos?" + usuarioAtivoMenorQue30);

        System.out.println();
        System.out.println(usuarioAtivo == false || idadePedro == 28);
    }
}
