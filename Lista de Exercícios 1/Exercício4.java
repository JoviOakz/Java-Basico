import java.util.Scanner;

public class Exercício4 {

    // F.U.P que leia os lados de um triângulo que classifique o triângulo em:
    // equilátero, isósceles e escaleno.
    
    public static void main(String[] args) {
        int lados[] = new int[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Valor do " + (i + 1) + "º lado: ");
            lados[i] = sc.nextInt();
        }

        if (lados[0] == lados[1] && lados[0] == lados[2]) {
            System.out.println("O triângulo é Equilátero");
        } else if (lados[0] != lados[1] && lados[0] != lados[2] && lados[1] != lados[2]) {
            System.out.println("O triângulo é Escaleno");
        } else {
            System.out.println("O triângulo é Isósceles");
        }

        sc.close();
    }
}