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
        double totalPedido = 0.0;
        System.out.printf("------- RESUMO PEDIDO -------\n");
        for (ItemPedido itemPedido : itens) {
            double total = itemPedido.getQuantidade() * itemPedido.getProduto().obterPrecoLiquido();
            System.out.printf("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f\n",
            itemPedido.getProduto().getClass().getSimpleName(), 
            itemPedido.getProduto().getTitulo(), 
            itemPedido.getProduto().obterPrecoLiquido(),
            itemPedido.getQuantidade(),
            total);
            totalPedido += total;
        }
        System.out.printf("----------------------------\n");
        System.out.printf("DESCONTO: %.2f\n", (percentualDesconto / 100) * totalPedido);
        System.out.printf("TOTAL PRODUTOS: %.2f\n", totalPedido);
        System.out.printf("----------------------------\n");
        System.out.printf("TOTAL PEDIDO: %.2f\n", totalPedido - ((percentualDesconto / 100) * totalPedido));
        System.out.printf("----------------------------\n");
    }
}
