import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvFileReader {
    public static void main(String[] args) {
        String fileName = "funcionarios.csv"; // Nome do arquivo fixo para leitura
        try (BufferedReader bf = new BufferedReader(new FileReader(fileName))) {
            String linhaStr = bf.readLine();
            while (linhaStr != null) {
                String[] linhaArray = linhaStr.split(",");
                System.out.println(String.format("Funcionário: %s", linhaArray[0]));
                System.out.println(String.format("Idade: %s", linhaArray[1]));
                System.out.println(String.format("Departamento: %s", linhaArray[2]));
                System.out.println(String.format("Salarial: %s", linhaArray[3]));
                System.out.println("------------------------");
                linhaStr = bf.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Leitura do arquivo concluída.");
    }
}