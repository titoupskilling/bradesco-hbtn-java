import java.util.ArrayList;
import java.util.List;

public class ProcessadorVideo {
    private List<CanalNotificacao> canais = new ArrayList<>();

    public void registrarCanal(CanalNotificacao canal) {
        this.canais.add(canal);
    }

    public void processar(Video video){
        for (CanalNotificacao canalNotificacao : canais) {
            Mensagem mensagem = new Mensagem();
            mensagem.setTipoMensagem(TipoMensagem.LOG);
            mensagem.setTexto(String.format("%s - %s", video.getArquivo(), video.getFormato()));
            canalNotificacao.notificar(mensagem);
        }
    }
}
