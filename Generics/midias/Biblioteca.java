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
        for (int index = 0; index < lista.size(); index++) {
            retorno = retorno.concat(lista.get(index).toString());
        }
        return retorno.toCharArray();
    }
    
}
