import java.util.ArrayList;

public class GestaoAlunos {

    private static ArrayList<Aluno> alunos;

    public static void adicionarAluno() {
        //
    }

    public static void excluirAluno(String nome) {
        //
    }

    public static void buscarAluno(String nome) {
        //
    }

    public static void listarAlunos() {
        System.out.println(alunos);
    }

    public static void main(String[] args) {
        adicionarAluno();
        listarAlunos();
        buscarAluno(null);
        excluirAluno(null);
    }
}
