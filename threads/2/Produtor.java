import java.util.Random;

public class Produtor extends Thread {
    private Fila fila;


    public Produtor(Fila fila) {
        this.fila = fila;
    }


    @Override
    public void run() {
        try {
            fila.adicionar(random());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    private int random() {
        return new Random().nextInt(100);
    }
    
}