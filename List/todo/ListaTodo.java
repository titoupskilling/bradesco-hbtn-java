
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ListaTodo {

    private Map<Integer, Tarefa> tarefas;


    public ListaTodo() {
        this.tarefas = new HashMap<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        if(tarefas.containsKey(tarefa.getIdentificador())){
            throw new IllegalArgumentException(
                String.format("Tarefa com identificador %d ja existente na lista", 
                tarefa.getIdentificador()));
        } else {
            tarefas.put(tarefa.getIdentificador(), tarefa);
        }
    }

    public boolean marcarTarefaFeita(int identificador) {
        if(tarefas.containsKey(identificador)){
            tarefas.get(identificador).setEstahFeita(true);
            return true;
        } else {
            return false;
        }
    }

    public void listarTarefas() {
        Iterator<Integer> it = tarefas.keySet().iterator();
        while (it.hasNext()) {
            Integer itemIdentificador = it.next();
            Tarefa itemTarefa = tarefas.get(itemIdentificador);
            System.out.println(
                String.format("[%s]  Id: %d - Descricao: %s", 
                itemTarefa.isEstahFeita() ? "X" : " ",
                itemTarefa.getIdentificador(),
                itemTarefa.getDescricao()));
        }
    }

    public boolean desfazerTarefa(int identificador) {
        if(tarefas.containsKey(identificador)){
            tarefas.get(identificador).setEstahFeita(false);
            return true;
        } else {
            return false;
        }
    }

    public void fazerTodas() {
        Iterator<Integer> it = tarefas.keySet().iterator();
        while (it.hasNext()) {
            Integer itemIdentificador = it.next();
            Tarefa itemTarefa = tarefas.get(itemIdentificador);
            itemTarefa.setEstahFeita(true);
        }
    }

    public void desfazerTodas() {
        Iterator<Integer> it = tarefas.keySet().iterator();
        while (it.hasNext()) {
            Integer itemIdentificador = it.next();
            Tarefa itemTarefa = tarefas.get(itemIdentificador);
            itemTarefa.setEstahFeita(false);
        }
    }
    
}
