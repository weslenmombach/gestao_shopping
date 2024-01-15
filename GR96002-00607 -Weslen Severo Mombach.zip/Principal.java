import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        Loja loja = null;
        Produto produto = null;

        do {
            exibirMenu();
            opcao = scanner.nextInt();

            if (opcao == 1) {
                loja = criarLoja(scanner);
            } else if (opcao == 2) {
                produto = criarProduto(scanner);
                if (produto != null) {
                    Data dataAtual = new Data(20, 10, 2023);
                    if (produto.estaVencido(dataAtual)) {
                        System.out.println("PRODUTO VENCIDO");
                    } else {
                        System.out.println("PRODUTO NÃO VENCIDO");
                    }
                }
            } else if (opcao == 3) {
                System.out.println("Programa encerrado!");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();

        if (loja != null) {
            System.out.println("Informações da Loja:");
            System.out.println("Nome: " + loja.getNome());
            System.out.println("Endereço: " + loja.getEndereco().getNomeDaRua() + ", " + loja.getEndereco().getCidade());
            System.out.println("Data de Fundação: " + loja.getDataFundacao().getDia() + "/" + loja.getDataFundacao().getMes() + "/" + loja.getDataFundacao().getAno());
            System.out.println("A quantidade de Funcionários é: " + loja.getQuantidadeFuncionarios());
            System.out.println("O salário base dos funcionários é: " + loja.getSalarioBaseFuncionario());
        }
    }

    public static void exibirMenu() {
        System.out.println("MENU:");
        System.out.println("(1) criar uma loja");
        System.out.println("(2) criar um produto");
        System.out.println("(3) sair");
        System.out.print("Escolha uma opção: ");
    }

    public static Loja criarLoja(Scanner scanner) {
        System.out.println("Criando uma nova loja!");
        scanner.nextLine();

        System.out.print("Digite o nome da loja: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o nome da rua: ");
        String rua = scanner.nextLine();

        System.out.print("Digite o nome da cidade: ");
        String cidade = scanner.nextLine();

        System.out.print("Digite o dia de fundação: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o mês de fundação: ");
        int mes = scanner.nextInt();

        System.out.print("Digite o ano de fundação: ");
        int ano = scanner.nextInt();

        System.out.print("Digite a quantidade de Funcionários: ");
        int quantidadeFuncionarios = scanner.nextInt();

        System.out.print("Digite o salário base dos Funcionários: ");
        double salarioBaseFuncionario = scanner.nextDouble();

        Endereco endereco = new Endereco(rua, cidade);
        Data dataFundacao = new Data(dia, mes, ano);

        return new Loja(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
    }

    public static Produto criarProduto(Scanner scanner) {
        System.out.println("Criando um novo produto!");
        scanner.nextLine();

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
    
        scanner.nextLine();

        System.out.print("Digite o dia de validade: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o mês de validade: ");
        int mes = scanner.nextInt();

        System.out.print("Digite o ano de validade: ");
        int ano = scanner.nextInt();

        scanner.nextLine();

        Data dataValidade = new Data(dia, mes, ano);

        return new Produto(nome, preco, dataValidade);
    }
}
