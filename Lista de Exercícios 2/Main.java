import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Contador novoContador = new Contador(0);
        // Retangulo novoRetangulo = new Retangulo();
        // Circulo novoCirculo = new Circulo();
        // Funcionario novoFuncionario = new Funcionario();
        // Livro livroFavorito = new Livro();

        // Exercicio 1 e 2
        // System.out.println("Contador: " + novoContador.mostrar());

        // for(int i = 1; i < 4; i++){
        // for(int j = 0; j < Math.pow(10, i); j++){
        // novoContador.incrementar();
        // System.out.print(novoContador.mostrar() + ",");
        // }

        // novoContador.zerar();
        // System.out.println("Contador zerado: " + novoContador.mostrar());
        // System.out.println("");
        // }

        // Exercicio 3 e 4
        // int value1 = 10;
        // int value2 = 5;

        // novoRetangulo.setLado1((double)value1);
        // novoRetangulo.setLado2((double)value2);

        // System.out.println("Area: " + novoRetangulo.calcularArea() + "cm");
        // System.out.println("Perimetro: " + novoRetangulo.calcularPerimetro() + "cm");

        // value2 = 7;

        // novoRetangulo.setLado2((double)value2);

        // System.out.println("");
        // System.out.println("Area: " + novoRetangulo.calcularArea() + "cm");
        // System.out.println("Perimetro: " + novoRetangulo.calcularPerimetro() + "cm");

        // Exercicio 5 e 6
        // int value = 10;

        // novoCirculo.setRaio((double)value);
        // novoCirculo.calcularArea();
        // novoCirculo.calcularPerimetro();

        // value = 4;

        // System.out.println("");
        // novoCirculo.setRaio((double)value);
        // novoCirculo.calcularArea();
        // novoCirculo.calcularPerimetro();

        // Exercicio 7 e 8
        // novoFuncionario.setNome("Luis");
        // novoFuncionario.setSobrenome("Silva");
        // novoFuncionario.setHorasTrabalhadas(10);
        // novoFuncionario.setValorPorHora(25.50);

        // novoFuncionario.nomeCompleto();
        // novoFuncionario.calcularSalario();
        // novoFuncionario.incrementarHoras(8);
        // novoFuncionario.calcularSalario();

        // Exercicio 9 e 10
        // livroFavorito.setTitulo("O Pequeno Principe");
        // livroFavorito.setQtdPaginas(98);
        // System.out.println("O livro '" + livroFavorito.getTitulo() + "' possui " + livroFavorito.getQtdPaginas() + " paginas");
        // System.out.println("");
        // livroFavorito.setPaginasLidas(20);
        // livroFavorito.verificarProgresso();
        // System.out.println("");
        // livroFavorito.setPaginasLidas(50);
        // livroFavorito.verificarProgresso();

        // Exercicio 11 e 12
        int numAulas = 20;

        Aluno[] aluno = new Aluno[10];

        for (int i = 0; i < 3; i++) {
            System.out.print("Nome do aluno " + i);
            String nome = sc.next();
            sc.nextLine();

            System.out.print("Matricula do aluno " + i);
            int matricula = sc.nextInt();
            sc.nextLine();

            System.out.print("Nota1 do aluno " + i);
            float nota1 = sc.nextFloat();
            sc.nextLine();

            System.out.print("Nota2 do aluno " + i);
            float nota2 = sc.nextFloat();
            sc.nextLine();

            aluno[i] = new Aluno(matricula, nome, nota1, nota2);
        }
    }
}