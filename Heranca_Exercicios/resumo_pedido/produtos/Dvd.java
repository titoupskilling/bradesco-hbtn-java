package produtos;

public class Dvd extends Produto {

    String diretor;
    String genero;
    int duracao;

    @Override
    public double obterPrecoLiquido() {
        return this.precoBruto * 1.20;
    }

    public Dvd(String titulo, int ano, String pais, double precoBruto, String diretor, String genero, int duracao) {
        super(titulo, ano, pais, precoBruto);
        this.diretor = diretor;
        this.genero = genero;
        this.duracao = duracao;
    }

    public String getDiretor() {
        return diretor;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracao() {
        return duracao;
    }
    
    
}
