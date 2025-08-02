import java.util.Scanner;


public class ArrayExercicio {


    public static void main(String[] args) {
        // Criando o scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);


        // Definindo o tamanho do array
        int tamanhoArray = 10;
        int[] numeros = new int[tamanhoArray];
        int soma = 0;
        int maiorNumero = Integer.MIN_VALUE;


        // Preenchendo o array com números fornecidos pelo usuário
        // Utilize scanner.nextInt(); para receber o numero digitado
        System.out.println("Digite 10 números inteiros:");

        for (int j = 0; j < 10; j++) {
            System.out.println(String.format("Digite o número %d:", j + 1));
            int numero = scanner.nextInt();
            numeros[j] = numero;
            if(maiorNumero < numero){
                maiorNumero = numero;
            }
            soma =+ numero;
        }
        
        System.out.print("\n\n\n");
        // Exibindo os resultados
        System.out.println("Conteúdo do array:");
        for (int i : numeros) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
        System.out.println(String.format("Soma de todos os números: %d", soma));

        System.out.println(String.format("Maior número no array: %d", maiorNumero));

        // Fechando o scanner
        scanner.close();
    }
}