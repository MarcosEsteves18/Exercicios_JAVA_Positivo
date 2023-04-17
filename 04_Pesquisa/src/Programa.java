import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Cidade cidade = new Cidade();
        Scanner sc = new Scanner(System.in);

        int opcao;
        do {
        	 System.out.println("1 - Registrar novo habitante");
             System.out.println("2 - Calcular média salarial");
             System.out.println("3 - Obter maior e menor idade");
             System.out.println("4 - Contar habitantes masculinos com salário até R$ 1000,00");
             System.out.println("5 - Contar habitantes femininos");
             System.out.println("0 - Sair");

             opcao = sc.nextInt();
             switch (opcao) {
                 case 1:
                     System.out.print("Idade: ");
                     int idade = sc.nextInt();
                     System.out.print("Gênero (M/F): ");
                     char genero = sc.next().charAt(0);
                     System.out.print("Renda: ");
                     double renda = sc.nextDouble();
                     cidade.registrarHabitante(idade, genero, renda);
                     break;
                 case 2:
                     System.out.printf("Média salarial: R$ %.2f\n", cidade.calcularMediaSalarial());
                     break;
                 case 3:
                     System.out.println("Maior idade: " + cidade.obterMaiorIdade());
                     System.out.println("Menor idade: " + cidade.obterMenorIdade());
                     break;
                 case 4:
                	 System.out.println("Número de habitantes masculinos com salário até R$ 1000,00: " +
                     cidade.contarHabitantesMasculinosComSalarioAteMil());
                     break;
                 case 5:
                     System.out.println("Número de habitantes femininos: " + cidade.contarHabitantesFemininos());
                     break;
                 case 0:
                     break;
                 default:
                     System.out.println("Opção inválida!");
             }
         } while (opcao != 0);

         sc.close();
     }
}