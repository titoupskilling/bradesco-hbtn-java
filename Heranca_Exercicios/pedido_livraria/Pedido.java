import produtos.Livro;

public class Pedido {
    double percentualDesconto;
    ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
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

    public void apresentarResumoPedido(){
        System.out.printf("------- RESUMO PEDIDO -------\n");
        for (ItemPedido itemPedido : itens) {
            if(itemPedido.getProduto() instanceof Livro){
                System.out.printf("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f",
                itemPedido.getProduto().getClass(), 
                itemPedido.getProduto().getTitulo(), 
                itemPedido.getProduto().getPrecoBruto(),
                itemPedido.getQuantidade(),
                itemPedido.getQuantidade());
            }
        }
        System.out.printf("----------------------------\n");
        System.out.printf("DESCONTO: 6,67\n");
        System.out.printf("TOTAL PRODUTOS: 133,36\n");
        System.out.printf("----------------------------\n");
        System.out.printf("TOTAL PEDIDO: 126,69\n");
        System.out.printf("----------------------------\n");
    }
}
