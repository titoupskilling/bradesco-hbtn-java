public class ProdutorConsumidor {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Produtor prod = new Produtor(buffer);
        Consumidor cons = new Consumidor(buffer);

        prod.start();
        cons.start();
    }
}