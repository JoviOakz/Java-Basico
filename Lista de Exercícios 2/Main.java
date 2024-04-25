import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int op = 9;

        // Contador cont = new Contador(0);
        // Contador novoContador = new Contador(0);
        Retangulo ret = new Retangulo();

        // Exercicio 1
        // while (op != 0) {
        //     System.out.println("Escolha uma opcao: ");
        //     System.out.println("1 - Zerar");
        //     System.out.println("2 - Incrementar");
        //     System.out.println("3 - Retornar o valor");
        //     System.out.println("0 - Sair");

        //     op = sc.nextInt();
        //     sc.nextLine();

        //     switch (op) {
        //         case 1:
        //             cont.zerar();

        //             break;

        //         case 2:
        //             cont.incrementar();

        //             break;

        //         case 3:
        //             System.out.println("");
                    
        //             System.out.println("Contador: " + cont.mostrar());

        //             break;

        //         default:
        //             break;
        //     }

        //     System.out.println("");
        // }

        // Exercicio 2
        // System.out.println("Contador: " + novoContador.mostrar());

        // for(int i = 1; i < 4; i++){
        //     for(int j = 0; j < Math.pow(10, i); j++){
        //         novoContador.incrementar();
        //         System.out.print(novoContador.mostrar() + ",");
        //     }

        //     novoContador.zerar();
        //     System.out.println("Contador zerado: " + novoContador.mostrar());
        //     System.out.println("");
        // }

        // Exercicio 3
        System.out.println("Insira o valor do lado 1: ");
        int value1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Agora insira o valor do lado 2: ");
        int value2 = sc.nextInt();
        sc.nextLine();

        ret.setLado1((double)value1);
        ret.setLado2((double)value2);



        sc.close();
    }
}