public class Autor implements Comparable{

    private String nome;

    private String sobreNome;

    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobreNome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    @Override
    public String toString() {
        return String.format("%s %s", nome, sobreNome);
    }


    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Autor)) return -1;
        Autor outro = (Autor) o;
        int cmpNome = this.nome.compareToIgnoreCase(outro.nome);
        if (cmpNome != 0) return cmpNome;
        return this.sobreNome.compareToIgnoreCase(outro.sobreNome);
    }
}