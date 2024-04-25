import java.util.Scanner;

public class NomeMes {

    public static String getNomeMesIf(int nMes) {
        if (nMes == 1) {
            return "Janeiro";
        } else if (nMes == 2) {
            return "Fevereiro";
        } else if (nMes == 3) {
            return "Março";
        } else if (nMes == 4) {
            return "Abril";
        } else if (nMes == 5) {
            return "Maio";
        } else if (nMes == 6) {
            return "Junho";
        } else if (nMes == 7) {
            return "Julho";
        } else if (nMes == 8) {
            return "Agosto";
        } else if (nMes == 9) {
            return "Setembro";
        } else if (nMes == 10) {
            return "Outubro";
        } else if (nMes == 11) {
            return "Novembro";
        } else if (nMes == 12) {
            return "Dezembro";
        } else {
            return "Mês inválido";
        }
    }

    public static String getNomeMesSwitch(int nMes) {
        switch (nMes) {
            case 1:
                return "Janeiro";

            case 2:
                return "Fevereiro";

            case 3:
                return "Março";

            case 4:
                return "Abril";

            case 5:
                return "Maio";

            case 6:
                return "Junho";

            case 7:
                return "Julho";

            case 8:
                return "Agosto";

            case 9:
                return "Setembro";

            case 10:
                return "Outubro";

            case 11:
                return "Novembro";

            case 12:
                return "Dezembro";

            default:
                return "Erro!";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero do mes:");
        int nMes = sc.nextInt();
        System.out.println("O mês selecionado é (if): " + getNomeMesIf(nMes));
        System.out.println("O mês selecionado é (switch): " + getNomeMesSwitch(nMes));
        sc.close();
    }
}