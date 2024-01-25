package estruturasdedados;

public class TesteArrayReferencia {

    public static void main(String[] args) {
        Produto[] produtos = new Produto[2];

        produtos[0] = new Produto("Iphone 13", 6299.99);
        produtos[1] = new Produto("Notebook I7", 4800.00);

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Produto: " + produtos[i].getNome() + ", Preço: " + produtos[i].getPreco());
        }
    }
}
