import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Blog {

    private List<Post> postagens;

    public Blog() {
        this.postagens = new ArrayList<>();
    }

    public void adicionarPostagem(Post post1) {
        postagens.add(post1);
    }

    public Set<String> obterTodosAutores() {
        Set<String> lista = new HashSet<>();
        for (Post post : postagens) {
            lista.add(post.getAutor());
        }
        List<String> listaOrdenada = new ArrayList<>(lista);
        Collections.sort(listaOrdenada);
        return new LinkedHashSet<String>(listaOrdenada);
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer> lista = new HashMap<String, Integer>();
        for (Post post : postagens) {
            int quantidade = 1;
            var item = lista.get(post.getCategoria());
            if(item != null){
                quantidade += item;
            }
            lista.put(post.getCategoria(), quantidade);
        }
        Map<String, Integer> mapaOrdenadoPorChave = new TreeMap<>(lista);
        return mapaOrdenadoPorChave;
    }
    
}
