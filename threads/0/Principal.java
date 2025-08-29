public class Principal {
    public static void main(String[] args) {
        Contador cont = new Contador();
        ThreadContador t1 = new ThreadContador(cont);
        ThreadContador t2 = new ThreadContador(cont);

        t1.start();
        t2.start();

        while (t1.isAlive() || t2.isAlive()) {
            
        }

        System.out.println(String.format("Valor final do contador: %d", cont.getContagem()));
    }
}
