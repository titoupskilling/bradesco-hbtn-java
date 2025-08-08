public interface Armazenavel<T> {
    public void adicionarAoInventario(String string, T comida);

    public T obterDoInventario(String nome);
}
