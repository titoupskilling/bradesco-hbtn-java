import java.util.List;

public class ManipularArrayNumeros {

    public static int buscarPosicaoNumero(List<Integer> numeros, int i){
        for (int j = 0; j < numeros.size(); j++) {
            if(numeros.get(j) == i){
                return j;
            }
        }
        return -1;
    }

    public static void adicionarNumero(List<Integer> numeros, int i) {
        if(buscarPosicaoNumero(numeros, i) < 0){
            numeros.add(i);
        } else {
            throw new IllegalArgumentException("Numero jah contido na lista");
        }
    }

    public static void removerNumero(List<Integer> numeros, int i) {
        int posicao = buscarPosicaoNumero(numeros, i);
        if(posicao >= 0){
            numeros.remove(posicao);
        } else {
            throw new IllegalArgumentException("Numero nao encontrado na lista");
        }
    }

    public static void substituirNumero(List<Integer> numeros, int numeroSubstituir, int numeroSubstituto) {
        int posicao = buscarPosicaoNumero(numeros, numeroSubstituir);
        if(posicao >= 0){
            numeros.set(posicao, numeroSubstituto);
        } else {
            numeros.add(numeroSubstituto);
        }
    }
    
}
