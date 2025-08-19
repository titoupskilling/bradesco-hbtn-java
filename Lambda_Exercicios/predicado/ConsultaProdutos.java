import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> criterio) {
        ArrayList<Produto> lista  = new ArrayList<>();
        for (int i = 0; i < produtos.size(); i++) {
            if(criterio.test(produtos.get(i))){
                lista.add(produtos.get(i));
            }
        }
        return lista;
    }
    
}
