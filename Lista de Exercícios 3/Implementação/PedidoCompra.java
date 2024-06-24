import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PedidoCompra {
    private int id_produto;
    private Produto produto;
    private Fornecedor fornecedor;
    private int quantidade;
    private Date previsao_entrega;

    private static List<PedidoCompra> pedidos = new ArrayList<>();

    PedidoCompra(int id_produto, Produto produto, Fornecedor fornecedor, int quantidade, Date previsao_entrega) {
        this.id_produto = id_produto;
        this.produto = produto;
        this.fornecedor = fornecedor;
        this.quantidade = quantidade;
        this.previsao_entrega = previsao_entrega;
    }

    public void gerarPedido() {
        System.out.println("Pedido gerado: " + this.toString());
    }

    public void registrarPedido() {
        pedidos.add(this);
        System.out.println("Pedido registrado: " + this.toString());
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getPrevisao_entrega() {
        return previsao_entrega;
    }

    public void setPrevisao_entrega(Date previsao_entrega) {
        this.previsao_entrega = previsao_entrega;
    }
}