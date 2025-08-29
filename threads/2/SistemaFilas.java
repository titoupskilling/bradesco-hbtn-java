public class SistemaFilas {
    public static void main(String[] args) {
        Fila fila = new Fila(10);
        Produtor prod1 = new Produtor(fila);
        Produtor prod2 = new Produtor(fila);
        Consumidor cons1 = new Consumidor(fila);
        Consumidor cons2 = new Consumidor(fila);

        prod1.start();
        prod2.start();
        cons1.start();
        cons2.start();
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}
