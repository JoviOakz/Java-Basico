import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AtendenteCaixa {
    int id_caixa;
    String nome;
    String endereco;
    int telefone;
    int cpf;
    String cargo;
    Date dt_admissao;

    private static List<AtendenteCaixa> atendentes = new ArrayList<>();

    AtendenteCaixa(int id_caixa, String nome, String endereco, int telefone, int cpf, String cargo, Date dt_admissao) {
        this.id_caixa = id_caixa;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.cargo = cargo;
        this.dt_admissao = dt_admissao;
    }

    public static void addAtendente(AtendenteCaixa atendente) {
        atendentes.add(atendente);
    }

    public static AtendenteCaixa consultarDados(int id_caixa) {
        for (AtendenteCaixa atendente : atendentes) {
            if (atendente.getId_caixa() == id_caixa) {
                return atendente;
            }
        }

        return null;
    }

    public static boolean atualizarDados(int id_caixa, String nome, String endereco, int telefone, int cpf, String cargo, Date dt_admissao) {
        for (AtendenteCaixa atendente : atendentes) {
            if (atendente.getId_caixa() == id_caixa) {
                atendente.setNome(nome);
                atendente.setEndereco(endereco);
                atendente.setTelefone(telefone);
                atendente.setCpf(cpf);
                atendente.setCargo(cargo);
                atendente.setDt_admissao(dt_admissao);
                return true;
            }
        }

        return false;
    }

    public int getId_caixa() {
        return id_caixa;
    }

    public void setId_caixa(int id_caixa) {
        this.id_caixa = id_caixa;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getDt_admissao() {
        return dt_admissao;
    }

    public void setDt_admissao(Date dt_admissao) {
        this.dt_admissao = dt_admissao;
    }
}