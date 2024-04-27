public class Funcionario {

    // Exercicio 7 e 8
    // Crie uma classe Funcionario que obedeça à descrição abaixo:
    // • A classe possui os atributos nome, sobrenome, horasTrabalhadas e
    // • valorPorHora.
    // • O método nomeCompleto deve escrever na tela o atributo nome concatenado
    // • ao atributo sobrenome.
    // • O método calcularSalario faz o cálculo de quanto o funcionário irá receber
    // no mês,
    // multiplicando o atributo horasTrabalhadas pelo atributo valorPorHora. Em
    // seguida, escreve o
    // valor na tela.
    // • O método incrementarHoras adiciona um valor passado por parâmetro ao valor
    // já existente no
    // atributo valorPorHora.

    // F.U.P que instancie a classe Funcionário do exercício anterior, criando um
    // objeto
    // novoFuncionario do tipo Funcionario. Depois o programa deve realizar as
    // seguintes ações:
    // 1) Atribua o valor “Luis” ao atributo nome.
    // 2) Atribua o valor “Silva” ao atributo sobrenome.
    // 3) Atribua o valor 10 ao atributo horasTrabalhadas
    // 4) Atribua o valor 25.50 ao atributo valorPorHora.
    // 5) Chame o método nomeCompleto.
    // 6) Chame o método calcularSalario.
    // 7) Adicione 8 ao atributo horasTrabalhadas utilizando o método
    // 8) incrementarHoras.
    // 9) Chame novamente o método calcularSalario.

    private String nome;
    private String sobrenome;
    private int horasTrabalhadas;
    private Double valorPorHora;

    Funcionario() {
        this.nome = null;
        this.sobrenome = null;
        this.horasTrabalhadas = 0;
        this.valorPorHora = null;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String new_nome) {
        this.nome = new_nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String new_sobrenome) {
        this.sobrenome = new_sobrenome;
    }

    public int getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int new_horasTrabalhadas) {
        this.horasTrabalhadas = new_horasTrabalhadas;
    }

    public Double getValorPorHora() {
        return this.valorPorHora;
    }

    public void setValorPorHora(Double new_valorPorHora) {
        this.valorPorHora = new_valorPorHora;
    }

    public void nomeCompleto() {
        System.out.println("Nome completo: " + nome + " " + sobrenome);
    }

    public void calcularSalario() {
        System.out.println("Salario: " + (horasTrabalhadas * valorPorHora));
    }

    public void incrementarHoras(int value) {
        horasTrabalhadas += value;
    }
}