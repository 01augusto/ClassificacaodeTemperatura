import java.util.Scanner;

public class ClassificaTemperatura {
    public static void main(String[] args) {
        // Peça ao usuário para inserir uma temperatura em graus Celsius
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperatura = scanner.nextDouble();

        // Classifique a temperatura
        String classificacao;
        if (temperatura > 30) {
            classificacao = "Quente";
        } else if (temperatura >= 15 && temperatura <= 30) {
            classificacao = "Agradável";
        } else {
            classificacao = "Frio";
        }

        // Imprima a classificação da temperatura
        System.out.println("A temperatura é " + classificacao + ".");
    }
}