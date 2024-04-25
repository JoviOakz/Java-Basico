import java.util.Scanner;

public class Exercício1 {

    // Faça um programa em Java (F.U.P) que pergunta um valor em metros e imprime o
    // correspondente em decímetros, centímetros e milímetros.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Metros: ");
        int value = sc.nextInt();
        System.out.println("O valor convertido para decímetros é: " + value * 10);
        System.out.println("O valor convertido para centímetros é: " + value * 100);
        System.out.println("O valor convertido para milímetros é: " + value * 1000);
        sc.close();
    }
}