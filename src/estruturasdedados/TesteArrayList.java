package estruturasdedados;

import java.util.ArrayList;

public class TesteArrayList {

    public static void main(String[] args) {
        ArrayList<Produto> lista = new ArrayList<>();
        ArrayList<String> nomes = new ArrayList<>();

        Produto produtoUm = new Produto("Celular", 1999.90);
        Produto produtoDois = new Produto("Celular", 2599.90);
        Produto produtoTres = new Produto("Geladeira", 2499);
        Produto produtoQuatro = new Produto("Notebook", 3000);

        lista.add(produtoUm);
        lista.add(produtoDois);
        lista.add(produtoTres);
        lista.add(produtoQuatro);

        Produto celular = lista.get(0);
        System.out.println(celular.getNome()+ " " + celular.getPreco());

        lista.remove(2);
//        lista.clear();

        System.out.println("Tamanho do Array: " + lista.size());
        System.out.println(lista.isEmpty());
        System.out.println(lista);

        System.out.println(lista.contains(produtoDois));
        System.out.println(lista.indexOf(produtoDois));

        System.out.println("Ref P1: " + produtoUm);
        System.out.println("Ref P2: " + produtoDois);

        if(produtoDois.equals(produtoUm)) {
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes");
        }
    }
}
