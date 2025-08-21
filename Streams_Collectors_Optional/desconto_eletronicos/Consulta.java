import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
        return pedido.getProdutos().stream()
            .filter((pedidoParam) -> pedidoParam.getCategoria() == CategoriaProduto.LIVRO)
            .toList();
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> produtos) {
        Optional<Produto> max = produtos.stream()
            .max(Comparator.comparing(Produto::getPreco));
        return max.get();
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, int precoMinimo) {
        return produtos.stream()
            .filter((pedidoParam) -> pedidoParam.getPreco() >= precoMinimo)
            .toList();
    }

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedidos) {
        return pedidos.stream()
            .filter(pedido -> pedido.getProdutos().stream().anyMatch(produto -> produto.getCategoria() == CategoriaProduto.ELETRONICO))
            .toList();
    }

    public static List<Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> produtos) {
        produtos.stream()
            .forEach(produto -> {
                if(produto.getCategoria() == CategoriaProduto.ELETRONICO)
                produto.setPreco(produto.getPreco() * 0.85);
            });
        return produtos;
    }
    
}
