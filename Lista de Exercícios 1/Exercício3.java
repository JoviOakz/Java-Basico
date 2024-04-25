import java.util.Scanner;

public class Exercício3 {

    // F.U.P que leia 10 números decimais e armazene-os em um vetor
    // (i) calcule a média dos números lidos
    // (ii) mostre o maior
    // (iii) menor número.
    
    public static void main(String[] args) {
        int count = 0;
        double number;
        double vector[] = new double[10];

        Scanner sc = new Scanner(System.in);

        while (count < 10) {
            System.out.print("Digite um número: ");
            number = sc.nextDouble();

            vector[count] = number;
            count++;
        }

        double max = vector[0];
        double min = vector[0];
        double sum = 0;

        for (int i = 0; i < 10; i++) {
            if (vector[i] > max) {
                max = vector[i];
            }

            if (vector[i] < min) {
                min = vector[i];
            }

            sum += vector[i];
        }

        System.out.println("A média dos números é: " + (sum / count+1));
        System.out.println("O maior valor é: " + max);
        System.out.println("O menor valor é: " + min);

        sc.close();
    }
}