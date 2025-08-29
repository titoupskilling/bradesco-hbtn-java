import java.util.LinkedList;

public class Fila {
    int capacidade;
    LinkedList<Integer> lista;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.lista = new LinkedList<>();
    }

    public synchronized void adicionar(int item) throws InterruptedException {
        while(lista.size() >= capacidade){
            wait();
        }
        lista.add(item);
        System.out.println("Produtor adicionou: " + item);
        notify();
    }

    public synchronized void retirar() throws InterruptedException {
        while(lista.size() <= 0){
            wait();
        }
        Integer item = lista.remove();
        System.out.println("Consumidor retirou: " + item);
        notify();
    }
}
