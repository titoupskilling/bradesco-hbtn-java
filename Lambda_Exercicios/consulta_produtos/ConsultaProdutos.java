import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro criterio) {
        ArrayList<Produto> lista  = new ArrayList<>();
        for (int i = 0; i < produtos.size(); i++) {
            if(criterio.testar(produtos.get(i))){
                lista.add(produtos.get(i));
            }
        }
        return lista;
    }
    
}
