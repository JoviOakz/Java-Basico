import java.util.Date;

public class AtendenteCaixa {
    int id_caixa;
    String nome;
    String endereco;
    int telefone;
    int cpf;
    String cargo;
    Date dt_admissao;

    AtendenteCaixa(int id_caixa, String nome, String endereco, int telefone, int cpf, String cargo, Date dt_admissao) {
        this.id_caixa = id_caixa;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.cargo = cargo;
        this.dt_admissao = dt_admissao;
    }

    public void consultarDados() {

    }

    public void atualizarDados() {
        
    }
}