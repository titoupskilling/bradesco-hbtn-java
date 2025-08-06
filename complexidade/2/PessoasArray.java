public class PessoasArray {

    private String[] nomes;

    public PessoasArray() {
        nomes =new String[]{"Amanda", "Beatriz", "Carlos","Daniela","Eduardo",
                "Fabio","Gustavo", "Hingrid","Isabela","Joao","Leise","Maria",
                "Norberto","Otavio","Paulo", "Quirino","Renata","Sabata",
                "Tais","Umberto","Vanessa","Xavier"};
    }

    public String[] getNomes() {
        return nomes;
    }

    public void setNomes(String[] nomes) {
        this.nomes = nomes;
    }

    // implementar o método de buscaBinaria
    public void buscaBinaria(String nome){
        boolean encontrado = false;
        System.out.println(String.format("Procurando o nome: \"%s\"", nome));

        int low = 0;
        int high = nomes.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Previne overflow

            System.out.println(String.format("Passando pelo indice: %d", mid));
            if (nomes[mid] == nome) {
                System.out.println(String.format("Nome %s encontrado na posição %d", nome, mid));
                encontrado = true;
                break;
            } else if (nomes[mid].compareTo(nome) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if(!encontrado){
            throw new IllegalArgumentException(String.format("O nome %s não se encontra no array de nomes", nome));
        }
    }
}