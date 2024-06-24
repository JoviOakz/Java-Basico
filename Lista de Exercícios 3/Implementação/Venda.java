import java.util.List;

public class Venda {
    int id_venda;
    Cliente cliente;
    AtendenteCaixa atendente;
    List<Produto> produtos;
    Double valor_total;
    String forma_pagamento;

    Venda(int id_venda, Cliente cliente, AtendenteCaixa atendente, List<Produto> produtos, Double valor_total, String forma_pagamento) {
        this.id_venda = id_venda;   
        this.cliente = cliente;   
        this.atendente = atendente;   
        this.produtos = produtos;   
        this.valor_total = valor_total;   
        this.forma_pagamento = forma_pagamento;   
    }

    public void selecionarCliente(Cliente cliente) {

    }

    public void selecionarCaixa(AtendenteCaixa atendente) {

    }

    public void escanearProduto(Produto produto, int quantidade) {

    }

    public void calcularTotal() {

    }

    public void gerarCupomFiscal() {
        
    }
}