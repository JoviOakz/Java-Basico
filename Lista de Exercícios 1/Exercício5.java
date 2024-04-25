import java.util.Random;
import java.util.Scanner;

public class Exercício5 {

    // F.U.P que simule um jogo de adivinhação. O programa inicializa sorteando um número
    // de 1 a 100. Depois, o usuário digita um palpite até acertar o número. Para cada palpite, o programa
    // indica se o número digitado é maior ou menor que o número sorteado. No final, o programa mostra
    // quantas tentativas o usuário precisou para acertar.
    
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        int numSort = rd.nextInt(100) + 1;
        int numAtp = 1000;
        int count = 0;

        while (numAtp != numSort) {
            System.out.print("Qual o seu palpite: ");
            numAtp = sc.nextInt();

            if (numAtp > numSort) {
                if ((numAtp - numSort) < 6) {
                    System.out.println("O palpite está próximo");
                } else {
                    System.out.println("Passou longe");
                }
            } else if (numAtp < numSort){
                if ((numSort - numAtp) < 6) {
                    System.out.println("O palpite está próximo");
                } else {
                    System.out.println("Passou longe");
                }
            } else {
                break;
            }

            count++;

            System.out.println("");
        }
    
        System.out.println("");
        System.out.println("Você venceu!");
        System.out.println("Tentativas até a vitória: " + count);

        sc.close();
    }
}