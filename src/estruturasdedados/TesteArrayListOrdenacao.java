package estruturasdedados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteArrayListOrdenacao {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Pedro");
        nomes.add("Ana");
        nomes.add("Nathalia");
        nomes.add("Giovanna");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        System.out.println();

        Collections.sort(nomes);
        for(String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("----------------------------------");

        ArrayList<Produto> produtos = new ArrayList<>();

        Produto produtoUm = new Produto("Celular", 15999.99);
        Produto produtoDois = new Produto("Geladeira", 14999.99);
        Produto produtoTres= new Produto("Notebook", 8999.99);
        Produto produtoQuatro = new Produto("Armário", 1999.99);

        produtos.add(produtoUm);
        produtos.add(produtoDois);
        produtos.add(produtoTres);
        produtos.add(produtoQuatro);

//        Collections.sort(produtos);
        Collections.sort(produtos, new PrecoProdutoComparator());
        for(Produto produto : produtos) {
            System.out.println("Produto: " + produto.getNome() + ", Preço: " + produto.getPreco());
        }
    }
}


class PrecoProdutoComparator implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        return (int) (p1.getPreco() - p2.getPreco());
    }
}
