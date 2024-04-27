public class Aluno {

    // Exercicio 11 e 12
    // Crie uma classe Aluno em Java, que obedeça às seguintes especificações:
    // a) Um aluno possui Matricula, Nome, Faltas, Nota1 e Nota2
    // b) A classe deve possuir o construtor padrão e a sobrecarga com os atributos
    // Matricula, Nome,
    // Nota1 e Nota2
    // c) Deve haver os setters e getters para os atributos Matricula, Nome, Nota1 e
    // Nota2
    // d) A classe deve possuir uma função para calcular a média através da fórmula:
    // media = (nota1 +
    // nota2) / 2.
    // e) A classe deve possuir uma função para calcular a frequência através da
    // fórmula: frequencia =
    // faltas / numeroAulas. O parâmetro numeroAulas é recebido como parâmetro da
    // função.
    // f) A classe deve possuir uma função para retornar a situação do aluno
    // conforme as regras a seguir:
    // 1) Média >= 7,0 E Frequência >= 75% = APROVADO
    // 2) 4,0 < Média < 7,0 E Frequência >= 75% = RECUPERAÇÃO
    // 3) Média < 4,0 OU Frequência < 75% = REPROVADO

    // F.U.P que crie 10 instâncias da classe Aluno. Para cada
    // instância, o programa solicita via
    // componente Scanner as informações de cada aluno. No final da leitura, o
    // programa deve informar a
    // média da turma, a quantidade de aprovados, alunos em recuperação e
    // reprovados. O programa também
    // informa o nome do aluno que tem a maior média.

    private int matricula;
    private String nome;
    private int faltas;
    private float nota1;
    private float nota2;

    Aluno(int matricula, String nome, float nota1, float nota2, int faltas) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.faltas = faltas;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int new_matricula) {
        this.matricula = new_matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String new_nome) {
        this.nome = new_nome;
    }

    public int getFaltas() {
        return this.faltas;
    }

    public void setFaltas(int new_faltas) {
        this.faltas = new_faltas;
    }

    public float getNota1() {
        return this.nota1;
    }

    public void setNota1(float new_nota1) {
        this.nota1 = new_nota1;
    }

    public float getNota2() {
        return this.nota2;
    }

    public void setNota2(float new_nota2) {
        this.nota2 = new_nota2;
    }

    public float calcularMedia() {
        float media = (nota1 + nota2) / 2;

        return media;
    }

    public float calcularFrequencia(int numAulas) {
        float frequencia = faltas / numAulas;

        return frequencia;
    }

    public String verificarSitucao(float media, float frequencia) {
        String situacao = null;

        if (media >= 7.0 && 1 - frequencia >= 0.75) {
            situacao = "APROVADO";
        } else if (media > 4.0 && media < 7.0 && 1 - frequencia >= 0.75) {
            situacao = "RECUPERACAO";
        } else if (media < 4.0 || 1 - frequencia < 0.75) {
            situacao = "REPROVADO";
        }

        return situacao;
    }
}