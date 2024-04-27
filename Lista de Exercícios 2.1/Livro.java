public class Livro {

    // Exercicio 9 e 10
    // Construa a classe Livro em Java, que obedeça à descrição abaixo:
    // • A classe possui os atributos titulo, qtdPaginas e paginasLidas. Esses
    // atributos
    // • devem ser marcados com o modificador de acesso private.
    // • Crie os métodos get e set para cada um dos atributos.
    // • Crie ainda o método verificarProgresso que deverá calcular a porcentagem de
    // leitura do livro
    // até o momento. Para isso, deverá usar os valores dos atributos qtdPaginas e
    // paginasLidas,
    // através da formula: porcentagem = paginasLidas * 100 / qtdPaginas. O valor da
    // porcentagem
    // deverá ser mostrado na tela conforme a mensagem “Você já leu X por cento do
    // livro”, onde o
    // valor de X é o valor calculado pela fórmula apresentada anteriormente.

    // F.U.P que instancia a classe Livro do exercicio anterior, criando um objeto
    // livrofavorito
    // do tipo Livro. Depois o programa deve realizar as seguintes ações:
    // 1) Altere o atributo titulo para “O Pequeno Príncipe”. Utilize, para isso, o
    // método setTitulo.
    // 2) Altere o atributo qtdPaginas para 98. Utilize, para isso, o método
    // setQtdPaginas.
    // 3) Escreva na tela a mensagem: “O livro X possui Y páginas”, onde no lugar de
    // X deverá
    // aparecer o valor do atributo titulo e, no lugar de Y deverá aparecer o valor
    // do atributo
    // qtdPaginas. Utilize, para tanto, os métodos getTitulo e getQtdPaginas.
    // 4) Altere a quantidade de paginasLidas para 20.
    // 5) Chame o método verificarProgresso.
    // 6) Altere a quantidade de paginasLidas para 50.
    // 7) Chame o método verificarProgresso.

    private String titulo;
    private int qtdPaginas;
    private int paginasLidas;

    Livro() {
        this.titulo = null;
        this.qtdPaginas = 0;
        this.paginasLidas = 0;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String new_titulo) {
        this.titulo = new_titulo;
    }

    public int getQtdPaginas() {
        return this.qtdPaginas;
    }

    public void setQtdPaginas(int new_qtdPaginas) {
        this.qtdPaginas = new_qtdPaginas;
    }

    public int getPaginasLidas() {
        return this.paginasLidas;
    }

    public void setPaginasLidas(int new_paginasLidas) {
        this.paginasLidas = new_paginasLidas;
    }

    public void verificarProgresso() {
        if (qtdPaginas == 0) {
            System.out.println("Voce nao leu nenhuma pagina ainda!");
        } else {
            int porcentagem = paginasLidas * 100 / qtdPaginas;

            System.out.println("Voce já leu " + porcentagem + " por cento do livro");
        }
    }
}