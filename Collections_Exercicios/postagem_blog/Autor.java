public class Autor implements Comparable{

    String nome;

    String sobrenome;

    public Autor(String nome, String sobreNome) {
        this.nome = nome;
        this.sobrenome = sobreNome;
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

    public void setSobrenome(String sobreNome) {
        this.sobrenome = sobreNome;
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