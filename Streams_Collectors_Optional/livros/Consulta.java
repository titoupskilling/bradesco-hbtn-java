import java.util.List;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
        return pedido.getProdutos().stream()
            .filter((pedidoParam) -> pedidoParam.getCategoria() == CategoriaProduto.LIVRO)
            .toList();
    }
    
}
