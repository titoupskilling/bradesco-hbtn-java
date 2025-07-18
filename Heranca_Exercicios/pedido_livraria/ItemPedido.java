import produtos.Produto;

public class ItemPedido {
    Produto produto;
    int quantidade;

    ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
}
