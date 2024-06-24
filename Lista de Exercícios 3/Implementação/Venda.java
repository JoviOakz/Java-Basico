import java.util.Date;
import java.util.List;

public class Venda {
    private int id_venda;
    private Cliente cliente;
    private AtendenteCaixa atendente;
    private List<Produto> produtos;
    private Double valor_total;
    private String forma_pagamento;
    private Date data;


    Venda(int id_venda, Cliente cliente, AtendenteCaixa atendente, List<Produto> produtos, Double valor_total, String forma_pagamento) {
        this.id_venda = id_venda;   
        this.cliente = cliente;   
        this.atendente = atendente;   
        this.produtos = produtos;   
        this.valor_total = valor_total;   
        this.forma_pagamento = forma_pagamento;   
    }

    public void selecionarCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void selecionarCaixa(AtendenteCaixa atendente) {
        this.atendente = atendente;
    }

    public void escanearProduto(Produto produto, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            this.produtos.add(produto);
        }
    }

    public void calcularTotal() {
        this.valor_total = 0.0;
        for (Produto produto : produtos) {
            this.valor_total += produto.getPreco_unitario();
        }
    }

    public void gerarCupomFiscal() {
        System.out.println("Cupom Fiscal");
        System.out.println("ID Venda: " + this.id_venda);
        System.out.println("Cliente: " + (this.cliente != null ? this.cliente.getNome() : "Não informado"));
        System.out.println("Atendente: " + (this.atendente != null ? this.atendente.getNome() : "Não informado"));
        System.out.println("Produtos: ");

        for (Produto produto : produtos) {
            System.out.println(" - " + produto.getNome() + ": R$ " + produto.getPreco_unitario());
        }

        System.out.println("Valor Total: R$ " + this.valor_total);
        System.out.println("Forma de Pagamento: " + this.forma_pagamento);
    }

    public int getId_venda() {
        return id_venda;
    }

    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public AtendenteCaixa getAtendente() {
        return atendente;
    }

    public void setAtendente(AtendenteCaixa atendente) {
        this.atendente = atendente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Double getValor_total() {
        return valor_total;
    }

    public void setValor_total(Double valor_total) {
        this.valor_total = valor_total;
    }

    public String getForma_pagamento() {
        return forma_pagamento;
    }

    public void setForma_pagamento(String forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}