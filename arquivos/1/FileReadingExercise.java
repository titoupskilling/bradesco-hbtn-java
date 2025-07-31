import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingExercise {
    public static void main(String[] args) {
        String fileName = "exemplo.txt"; // Nome do arquivo fixo para leitura
        System.out.println(String.format("Conteúdo do arquivo '%s':", fileName));
        System.out.println();
        try (BufferedReader bf = new BufferedReader(new FileReader(fileName))) {
            String linhaStr = bf.readLine();
            while (linhaStr != null) {
                System.out.println(linhaStr);
                linhaStr = bf.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("Leitura do arquivo concluída.");
    }
}