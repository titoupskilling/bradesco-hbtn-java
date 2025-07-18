package produtos;

public class Livro extends Produto {

    int paginas;
    String autor;
    int edicao;

    @Override
    public double obterPrecoLiquido() {
        return this.precoBruto * 1.15;
    }

    public Livro(String titulo, int ano, String pais, double precoBruto, int paginas, String autor, int edicao) {
        super(titulo, ano, pais, precoBruto);
        this.paginas = paginas;
        this.autor = autor;
        this.edicao = edicao;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getAutor() {
        return autor;
    }

    public int getEdicao() {
        return edicao;
    }
    
}
