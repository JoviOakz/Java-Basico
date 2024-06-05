import java.io.FileNotFoundException;
import java.io.IOException;

public class TesteMotocicleta {
    public static void main(String[] args) {
        Motocicleta moto = new Motocicleta("Honda", "Titan", 30);
        Serializador serializador = new Serializador();
        try {
            serializador.gravar("moto.dat", moto);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}