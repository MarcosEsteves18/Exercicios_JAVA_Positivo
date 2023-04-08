import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ano = 0;
		System.out.println("Digite um Ano e verificamos se é ano bissexto ou nao : ");
		ano = sc.nextInt();
		
		
		if((ano % 400 == 0) || (ano % 4 == 0) && (ano % 100 != 0)) {
			System.out.print("Ano eh bissexto");
		}else {
			System.out.print("Ano Nao eh bissexto");
		}
		
		sc.close();
	}

}
