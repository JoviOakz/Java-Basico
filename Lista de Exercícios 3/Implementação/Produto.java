import java.util.List;

public class Produto {
    int id_produto;
    String nome;
    String descricao;
    Double preco_unitario;
    int qty_estoque;
    Fornecedor fornecedor_principal;
    List<Fornecedor> fornecedores_alternativos;

    Produto(int id_produto, String nome, String descricao, Double preco_unitario, int qty_estoque, Fornecedor fornecedor_principal, List<Fornecedor> fornecedores_alternativos) {
        this.id_produto = id_produto;
        this.nome = nome;
        this.descricao = descricao;
        this.preco_unitario = preco_unitario;
        this.qty_estoque = qty_estoque;
        this.fornecedor_principal = fornecedor_principal;
        this.fornecedores_alternativos = fornecedores_alternativos;
    }

    public void consultarEstoque() {

    }

    public void registrarBaixa() {
        
    }
}