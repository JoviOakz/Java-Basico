import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente {
    int id_cliente;
    String nome;
    String endereco;
    int telefone;
    int cpf;
    Date dt_nascimento;

    private static List<Cliente> clientes = new ArrayList<>();

    Cliente(int id_cliente, String nome, String endereco, int telefone, int cpf, Date dt_nascimento) {
        this.id_cliente = id_cliente;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.dt_nascimento = dt_nascimento;
    }

    public static void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public static Cliente consultarDados(int id_cliente) {
        for (Cliente cliente : clientes) {
            if (cliente.getId_cliente() == id_cliente) {
                return cliente;
            }
        }
        
        return null;
    }

    public static boolean atualizarDados(int id_cliente, String nome, String endereco, int telefone, int cpf, Date dt_nascimento) {
        for (Cliente cliente : clientes) {
            if (cliente.getId_cliente() == id_cliente) {
                cliente.setNome(nome);
                cliente.setEndereco(endereco);
                cliente.setTelefone(telefone);
                cliente.setCpf(cpf);
                cliente.setDt_nascimento(dt_nascimento);
                return true;
            }
        }

        return false;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
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

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Date getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(Date dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }
}