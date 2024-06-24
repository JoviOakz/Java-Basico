import java.util.ArrayList;
import java.util.List;

public class Fornecedor {
    int id_fornecedor;
    String nome;
    String endereco;
    String telefone;
    String cnpj;

    Fornecedor(int id_fornecedor, String nome, String endereco, String telefone, String cnpj) {
        this.id_fornecedor = id_fornecedor;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cnpj = cnpj;
    }

    private static List<Fornecedor> fornecedores = new ArrayList<>();

    public static void addFornecedor(Fornecedor fornecedor) {
        fornecedores.add(fornecedor);
    }

    public static Fornecedor consultarDados(int id_fornecedor) {
        for (Fornecedor fornecedor : fornecedores) {
            if (fornecedor.getId_fornecedor() == id_fornecedor) {
                return fornecedor;
            }
        }

        return null;
    }

    public static boolean atualizarDados(int id_fornecedor, String nome, String endereco, String telefone, String cnpj) {
        for (Fornecedor fornecedor : fornecedores) {
            if (fornecedor.getId_fornecedor() == id_fornecedor) {
                fornecedor.setNome(nome);
                fornecedor.setEndereco(endereco);
                fornecedor.setTelefone(telefone);
                fornecedor.setCnpj(cnpj);

                return true;
            }
        }

        return false;
    }

    public int getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}