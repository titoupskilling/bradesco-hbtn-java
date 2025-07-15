public class PersonagemGame {

    private int saudeAtual;
    private String nome;
    private String status;


    public String getStatus() {
        return status;
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
        if (saudeAtual > 0) {
            this.status = "vivo";
        } else if (saudeAtual == 0) {
            this.status = "morto";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void tomarDano(int quantidadeDeDano) {
        if ((saudeAtual - quantidadeDeDano) > 0) {
            setSaudeAtual(saudeAtual - quantidadeDeDano);
        } else {
            setSaudeAtual(0);
        }
    }

    public void receberCura(int quantidadeDeCura) {
        if ((saudeAtual + quantidadeDeCura) < 100) {
            setSaudeAtual(saudeAtual + quantidadeDeCura);
        } else {
            setSaudeAtual(100);
        }
    }
}