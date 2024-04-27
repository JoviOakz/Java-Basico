public class Contador {

    // Excercicio 1 e 2
    // Crie uma classe Contador, que encapsule um valor usado para contagem de itens
    // ou eventos. A classe deve oferecer métodos que devem:
    // a) Zerar;
    // b) Incrementar;
    // c) Retornar o valor do contador.

    // Faça um programa (F.U.P) que instancie a classe contatodor do exercício
    // anterior, criando
    // um objeto novoContador do tipo Contador. Depois o programa deve realizar as
    // seguintes ações:
    // 1) Use um loop para incrementar o contador até 10.
    // 2) Zere o valor do contator.
    // 3) Use um loop para incrementar o contador até 100.
    // 4) Zere o valor do contator.
    // 5) Use um loop para incrementar o contador até 1000.
    // 6) Zere o valor do contator.

    private int cont;

    Contador(int num) {
        this.cont = num;
    }

    public void zerar() {
        cont = 0;
    }

    public void incrementar() {
        cont++;
    }

    public int mostrar() {
        return cont;
    }
}