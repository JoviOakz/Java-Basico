import java.util.Date;

public class PedidoCompra {
    int id_produto;
    Produto produto;
    Fornecedor fornecedor;
    int quantidade;
    Date previsao_entrega;

    PedidoCompra(int id_produto, Produto produto, Fornecedor fornecedor, int quantidade, Date previsao_entrega) {
        this.id_produto = id_produto;
        this.produto = produto;
        this.fornecedor = fornecedor;
        this.quantidade = quantidade;
        this.previsao_entrega = previsao_entrega;
    }

    public void gerarPedido() {

    }

    public void registrarPedido() {
        
    }
}