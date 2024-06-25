import java.util.ArrayList;
import java.util.List;

public class Fornecedor implements Identificador {
    private int id_fornecedor;
    private String nome;
    private String endereco;
    private int telefone;
    private String cnpj;

    Fornecedor(int id_fornecedor, String nome, String endereco, int i, String cnpj) {
        this.id_fornecedor = id_fornecedor;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = i;
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

    public static boolean atualizarDados(int id_fornecedor, String nome, String endereco, int telefone, String cnpj) {
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

    @Override
    public int getId() {
        return this.id_fornecedor;
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

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}