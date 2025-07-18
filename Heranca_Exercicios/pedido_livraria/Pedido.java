

public class Pedido {
    double percentualDesconto;
    ItemPedido[] itens;

    Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal(){
        double soma = 0.0;
        for (ItemPedido itemPedido : itens) {
            soma += itemPedido.quantidade * itemPedido.getProduto().obterPrecoLiquido();
        }
        return soma - (soma * (percentualDesconto / 100));
    }
}
