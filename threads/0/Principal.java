public class Principal {
    public static void main(String[] args) {
        Contador cont = new Contador();
        ThreadContador t1 = new ThreadContador(cont);
        ThreadContador t2 = new ThreadContador(cont);

        t1.run();
        t2.run();

        System.out.println(String.format("Valor final do contador: %d", cont.getContagem()));
    }
}
