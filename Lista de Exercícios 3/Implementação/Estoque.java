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
        if (produto != null && quantidade > 0) {
            if (produto.getQty_estoque() >= quantidade) {
                produto.setQty_estoque(produto.getQty_estoque() - quantidade);
                if (produto.getQty_estoque() < 10) {  // Assuming 10 as the minimum stock threshold
                    emitirAlerta(produto);
                }
                return true;
            } else {
                System.out.println("Erro: quantidade solicitada excede o estoque disponível para o produto " + produto.getNome());
            }
        } else {
            System.out.println("Erro: produto não encontrado ou quantidade inválida.");
        }
        return false;
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