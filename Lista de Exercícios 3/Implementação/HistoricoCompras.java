import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HistoricoCompras {
    private List<Venda> compras;

    HistoricoCompras(List<Venda> compras) {
        this.compras = compras;
    }

    public void registrarCompra(Venda venda) {
        compras.add(venda);
    }

    public List<Venda> consultarCompras(Cliente cliente, Date data_inicio, Date data_fim) {
        List<Venda> resultado = new ArrayList<>();
        for (Venda venda : compras) {
            if (venda.getCliente().getId_cliente() == cliente.getId_cliente() &&
                !venda.getData().before(data_inicio) &&
                !venda.getData().after(data_fim)) {
                resultado.add(venda);
            }
        }
        
        return resultado;
    }

    public List<Venda> getCompras() {
        return compras;
    }

    public void setCompras(List<Venda> compras) {
        this.compras = compras;
    }
}