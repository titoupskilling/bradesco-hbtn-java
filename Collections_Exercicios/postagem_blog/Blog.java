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
        for (Post post : postagens) {
            if (post.getAutor().equals(post1.getAutor()) && post.getTitulo().equals(post1.getTitulo())) {
                throw new IllegalArgumentException("Postagem jah existente");
            }
        }
        postagens.add(post1);
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> lista = new HashSet<>();
        for (Post post : postagens) {
            lista.add(post.getAutor());
        }
        List<Autor> listaOrdenada = new ArrayList<>(lista);
        Collections.sort(listaOrdenada);
        return new LinkedHashSet<Autor>(listaOrdenada);
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> lista = new HashMap<Categorias, Integer>();
        for (Post post : postagens) {
            int quantidade = 1;
            var item = lista.get(post.getCategoria());
            if(item != null){
                quantidade += item;
            }
            lista.put(post.getCategoria(), quantidade);
        }
        Map<Categorias, Integer> mapaOrdenadoPorChave = new TreeMap<>(lista);
        return mapaOrdenadoPorChave;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> lista = new java.util.TreeSet<>((p1, p2) -> p1.getTitulo().compareToIgnoreCase(p2.getTitulo()));
        return lista;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        Set<Post> lista = new java.util.TreeSet<>((p1, p2) -> p1.getTitulo().compareToIgnoreCase(p2.getTitulo()));
        for (Post post : postagens) {
            if(post.getCategoria().equals(categoria)){
                lista.add(post);
            }
        }
        return lista;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> mapa = new TreeMap<>();
        for (Post post : postagens) {
            Categorias categoria = post.getCategoria();
            mapa.computeIfAbsent(categoria, k -> new java.util.TreeSet<>((p1, p2) -> p1.getTitulo().compareToIgnoreCase(p2.getTitulo()))).add(post);
        }
        return mapa;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> mapa = new TreeMap<>();
        for (Post post : postagens) {
            Autor autor = post.getAutor();
            mapa.computeIfAbsent(autor, k -> new java.util.TreeSet<>((p1, p2) -> p1.getTitulo().compareToIgnoreCase(p2.getTitulo()))).add(post);
        }
        return mapa;
    }
    
}
