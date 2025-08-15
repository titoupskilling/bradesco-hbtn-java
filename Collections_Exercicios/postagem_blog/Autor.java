public class Autor implements Comparable{

    private String nome;

    private String sobrenome;

    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return String.format("%s %s", nome, sobrenome);
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Autor)) return -1;
        Autor outro = (Autor) o;
        int cmpNome = this.nome.compareToIgnoreCase(outro.nome);
        if (cmpNome != 0) return cmpNome;
        return this.sobrenome.compareToIgnoreCase(outro.sobrenome);
    }
}