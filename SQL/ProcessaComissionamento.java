import java.math.BigDecimal;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class ProcessaComissionamento {

    public static int processaComissionamento(Date dataInicial, Date dataFinal, List<ComVenda> comVendas,
            List<ComVende> comVendes) {
        int totalProcessado = 0;

        for (ComVenda venda : comVendas) {
            if (!venda.d_datavenda.before(dataInicial) && !venda.d_datavenda.after(dataFinal)
                    && venda.n_totavenda.compareTo(BigDecimal.ZERO) > 0) {
                BigDecimal comissao = getComissao(venda.n_numevende, comVendes);

                BigDecimal valorComissao;
                if (comissao.compareTo(BigDecimal.ZERO) > 0) {
                    valorComissao = venda.n_totavenda.multiply(comissao).divide(new BigDecimal("100"));
                } else if (comissao.compareTo(BigDecimal.ZERO) == 0) {
                    valorComissao = BigDecimal.ZERO;
                } else {
                    comissao = BigDecimal.ONE;
                    valorComissao = venda.n_totavenda.multiply(comissao).divide(new BigDecimal("100"));
                }

                venda.n_vcomvenda = valorComissao;
                totalProcessado++;
            }
        }

        return totalProcessado;
    }

    private static BigDecimal getComissao(int vendedorId, List<ComVende> comVendes) {
        for (ComVende vende : comVendes) {
            if (vende.n_numevende == vendedorId) {
                return vende.n_porcvende;
            }
        }
        return BigDecimal.valueOf(-1); // Assuming -1 if the vendedorId is not found
    }

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        // Example Data
        List<ComVenda> comVendas = new ArrayList<>();
        List<ComVende> comVendes = new ArrayList<>();

        // Add example data to comVendas
        comVendas.add(new ComVenda(1, new BigDecimal("1000"), 1, new Date(2015, 0, 15)));
        comVendas.add(new ComVenda(2, new BigDecimal("2000"), 2, new Date(2015, 2, 10)));
        comVendas.add(new ComVenda(3, new BigDecimal("3000"), 3, new Date(2015, 4, 20)));

        // Add example data to comVendes
        comVendes.add(new ComVende(1, new BigDecimal("10")));
        comVendes.add(new ComVende(2, new BigDecimal("20")));
        comVendes.add(new ComVende(3, new BigDecimal("0")));

        // Process
        Date dataInicial = new Date(2015, 0, 1);
        Date dataFinal = new Date(2015, 4, 30);

        int totalProcessado = processaComissionamento(dataInicial, dataFinal, comVendas, comVendes);

        System.out.println("Total Processado: " + totalProcessado);
        for (ComVenda venda : comVendas) {
            System.out.println("Venda ID: " + venda.n_numevenda + ", Valor Comissao: " + venda.n_vcomvenda);
        }
    }
}