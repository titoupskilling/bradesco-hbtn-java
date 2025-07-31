import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritingExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicita o nome do arquivo
            System.out.print("Digite o nome do arquivo (com extensão .txt): ");
            String fileName = scanner.nextLine();
            if(fileName.contains("sair")){
                scanner.close();
                return;
            }
            FileWriter fr = new FileWriter(new File(fileName));
            BufferedWriter br = new BufferedWriter(fr);

            String txtLine = "";
            System.out.print("Digite a proxima linha de texto: ");
            txtLine = scanner.nextLine();
            while (!txtLine.equals("sair")) {
                br.append(txtLine + "\n");
                System.out.print("Digite a proxima linha de texto: ");
                txtLine = scanner.nextLine();
            }

            System.out.print("o arquivo foi criado e seu conteudo foi salvo com sucesso.");
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        scanner.close();
    }
}