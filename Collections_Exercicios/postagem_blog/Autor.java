public class Autor implements Comparable<Autor> {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return nome.equalsIgnoreCase(autor.nome) && sobrenome.equalsIgnoreCase(autor.sobrenome);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(nome.toLowerCase(), sobrenome.toLowerCase());
    }

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
    public int compareTo(Autor outro) {
        int cmpNome = this.nome.compareToIgnoreCase(outro.nome);
        if (cmpNome != 0) return cmpNome;
        return this.sobrenome.compareToIgnoreCase(outro.sobrenome);
    }
}