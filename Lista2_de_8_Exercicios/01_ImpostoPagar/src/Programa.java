import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
        Autonomo autonomo = new Autonomo();
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("MENU");
            System.out.println("1 - cadastro de vendas");
            System.out.println("2 - consulta de imposto a pagar no mês");
            System.out.println("0 - sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor da venda: ");
                    double valor = sc.nextDouble();
                    System.out.print("Digite o dia da venda: ");
                    int dia = sc.nextInt();
                    System.out.print("Digite o mês da venda: ");
                    int mes = sc.nextInt();
                    System.out.print("Digite o ano da venda: ");
                    int ano = sc.nextInt();
                    Venda venda = new Venda(valor, dia, mes, ano);
                    autonomo.cadastrarVenda(venda);
                    System.out.println("Venda cadastrada com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o mês para consultar o imposto a pagar: ");
                    mes = sc.nextInt();
                    System.out.print("Digite o ano para consultar o imposto a pagar: ");
                    ano = sc.nextInt();
                    double multaTotal = autonomo.calcularMultaTotal(mes, ano);
                    System.out.printf("Multa total a pagar no mês"+ mes+ "/" + ano +": "+ multaTotal);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
            System.out.println();
        } while (opcao != 0);
        sc.close();
	}
}