import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int funcionarios = 0, i = 0, cont = 0;
		double media = 0, salarioTotal = 0;
		
		System.out.println("Quantos funcionarios: ");
		funcionarios = sc.nextInt();
		double salarios[] = new double[funcionarios];
		
		for(i = 0; i < funcionarios ; i++) {
			System.out.println("Digite o salario do " + i + "° : ");
			salarios[i] = sc.nextDouble();

			salarioTotal = salarioTotal + salarios[i];
			media = salarioTotal / funcionarios;
			
		}
		
		for(i = 0; i < funcionarios ; i++) {
			if(salarios[i] > media) {
				cont = cont + 1;
			}
		}
		
		//System.out.printf("%.2f %n", salarioTotal);
		//System.out.printf("%.2f %n", media);
		System.out.printf("%d", cont);
		sc.close();
	}

}
