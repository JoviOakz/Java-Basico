import java.util.Random;

public class Sorteio {
    
    public static void main(String[] args) {
        Random gerador = new Random();

        int cont = 1;
        int maior = 0;
        int menor = 101;
        int soma = 0;

        while (cont <= 1000000) {
            int num = gerador.nextInt(100) + 1;
            System.out.print(num + " ");
            cont += 1;
            soma += num;

            if (num > maior) {
                maior = num;
            }

            if (num < menor) {
                menor = num;
            }
        }

        System.out.println("");
        System.out.println("O menor número é: " + menor);
        System.out.println("O maior número é: " + maior);
        System.out.println("A média é: " + (soma/1000));
    }
}