import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HistoricoVendas {
    private List<Venda> vendas;

    HistoricoVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }

    public void registarVenda(Venda venda) {
        vendas.add(venda);
    }

    public List<Venda> consultarVendas(AtendenteCaixa atendente, Date data_inicio, Date data_fim) {
        List<Venda> resultado = new ArrayList<>();
        for (Venda venda : vendas) {
            if (venda.getAtendente().getId_caixa() == atendente.getId_caixa() &&
                !venda.getData().before(data_inicio) &&
                !venda.getData().after(data_fim)) {
                resultado.add(venda);
            }
        }

        return resultado;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }
}