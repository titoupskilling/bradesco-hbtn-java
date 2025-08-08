import java.util.LinkedHashMap;
import java.util.Map;

public class Armazem<T> implements Armazenavel<T> {
    private Map<String, T> lista = new LinkedHashMap<>();

    public void adicionarAoInventario(String string, T comida) {
        lista.put(string, comida);
    }

    public T obterDoInventario(String nome) {
        return lista.get(nome);
    }
}
