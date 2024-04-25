public class Exercício2{

    // F.U.P que imprime uma tabela com a tabuada de 1 a 9.

    public static void main(String[] args) {
        for (int x = 1; x < 10; x++) {
            for (int y = 1; y < 11; y++){
                System.out.println(y + " x " + x + " = " + (y * x));
            }
            
            System.out.println("");
        }
    }
}