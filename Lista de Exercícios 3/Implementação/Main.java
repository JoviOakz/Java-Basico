import java.util.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação de clientes
        Cliente cliente1 = new Cliente(1, "João Silva", "Rua A, 123", 987654321, 1234567890, new Date());
        Cliente cliente2 = new Cliente(2, "Maria Oliveira", "Rua B, 456", 987654322, 1234567891, new Date());

        // Criação de atendentes
        AtendenteCaixa atendente1 = new AtendenteCaixa(1, "Carlos Souza", "Rua C, 789", 987654323, 1234567892, "Caixa", new Date());

        // Criação de produtos
        Fornecedor fornecedor1 = new Fornecedor(1, "Douglas Santos", "Rua C, 789", 99158859, "123131231322");
        Produto produto1 = new Produto(1, "Arroz", "Arroz Branco 1kg", 5.0, 100, fornecedor1, new ArrayList<Fornecedor>());

        // Criação de vendas
        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        Venda venda1 = new Venda(1, cliente1, atendente1, produtos, 5.0, "Dinheiro");

        while (true) {
            System.out.println("Escolha uma operação:");
            System.out.println("1. Consultar dados do cliente");
            System.out.println("2. Atualizar dados do cliente");
            System.out.println("3. Consultar dados do atendente");
            System.out.println("4. Registrar venda");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Consultar dados de qual cliente? (1 ou 2)");
                    int clienteId = scanner.nextInt();
                    scanner.nextLine();
                    if (clienteId == 1) {
                        cliente1.consultarDados(1);
                        System.out.println(cliente1.getNome());
                    } else if (clienteId == 2) {
                        cliente2.consultarDados(2);
                        System.out.println(cliente2.getNome());
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;
                case 2:
                    System.out.println("Atualizar dados de qual cliente? (1 ou 2)");
                    clienteId = scanner.nextInt();
                    scanner.nextLine();
                    if (clienteId == 1) {
                        cliente1.atualizarDados(4, "Daniel", "Rua Daniel Mouro", 11113333, 444322213, new Date());
                    } else if (clienteId == 2) {
                        cliente2.atualizarDados(8, "Roberta", "Rua Roberta Costa", 66677788, 564667312, new Date());
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;
                case 3:
                    atendente1.consultarDados(1);
                    break;
                case 4:
                    System.out.println("Registrar venda...");
                    venda1.gerarCupomFiscal();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
