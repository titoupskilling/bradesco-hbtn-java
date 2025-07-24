import java.util.ArrayList;
import java.util.List;

import atividades.Atividade;

public class Workflow {

    private List<Atividade> atividades = new ArrayList<>();

    public void registrarAtividade(Atividade atividade) {
        atividades.add(atividade);
    }

    public void executar() {
        for (Atividade atividade : atividades) {
            atividade.executar();
        }
    }
}
