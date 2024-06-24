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
        System.out.println("Produto: " + nome);
        System.out.println("Quantidade em estoque: " + qty_estoque);
    }

    public void registrarBaixa(int quantidade) {
        if (quantidade > qty_estoque) {
            System.out.println("Erro: quantidade solicitada excede o estoque disponível.");
        } else {
            qty_estoque -= quantidade;
            System.out.println("Baixa registrada com sucesso. Quantidade restante em estoque: " + qty_estoque);
        }
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco_unitario() {
        return preco_unitario;
    }

    public void setPreco_unitario(Double preco_unitario) {
        this.preco_unitario = preco_unitario;
    }

    public int getQty_estoque() {
        return qty_estoque;
    }

    public void setQty_estoque(int qty_estoque) {
        this.qty_estoque = qty_estoque;
    }

    public Fornecedor getFornecedor_principal() {
        return fornecedor_principal;
    }

    public void setFornecedor_principal(Fornecedor fornecedor_principal) {
        this.fornecedor_principal = fornecedor_principal;
    }

    public List<Fornecedor> getFornecedores_alternativos() {
        return fornecedores_alternativos;
    }

    public void setFornecedores_alternativos(List<Fornecedor> fornecedores_alternativos) {
        this.fornecedores_alternativos = fornecedores_alternativos;
    }
}