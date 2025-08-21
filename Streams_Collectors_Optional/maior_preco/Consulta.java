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
    
}
