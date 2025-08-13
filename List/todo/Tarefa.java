public class Tarefa {
    
    private String descricao;
    private boolean estahFeita;
    private int identificador;
    
    public Tarefa(String descricao, int identificador) {
        this.descricao = descricao;
        this.identificador = identificador;
        modificarDescricao();
    }

    private void modificarDescricao(){
        if(descricao == null || descricao.isEmpty()){
            throw new IllegalArgumentException("Descricao de tarefa invalida");
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isEstahFeita() {
        return estahFeita;
    }

    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

}
