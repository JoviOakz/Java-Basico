import java.util.List;

public class Estoque {
    List<Produto> produtos;

    Estoque(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Produto consultarProduto(int id_produto) {
        for (Produto produto : produtos) {
            if (produto.getId_produto() == id_produto) {
                return produto;
            }
        }
        
        return null;
    }

    public boolean registrarBaixa(Produto produto, int quantidade) {
    }

    public void emitirAlerta(Produto produto) {
        System.out.println("Alerta: Produto " + produto.getNome() + " está abaixo do nível mínimo de estoque.");
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}