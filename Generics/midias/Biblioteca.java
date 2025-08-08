import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Biblioteca<T extends Midia> {

    List<T> lista = new ArrayList<>();

    public void adicionarMidia(T midia) {
        this.lista.add(midia);
    }

    public char[] obterListaMidias() {
        String retorno = "";
        retorno = lista.toString();
        return retorno.toCharArray();
    }
    
}
