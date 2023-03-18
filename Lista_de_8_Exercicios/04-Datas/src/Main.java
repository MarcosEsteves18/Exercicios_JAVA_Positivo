import java.util.Scanner;
public class Main {

	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);
	
		String mes[] =  {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		
		System.out.print("Digite um mes em numero: ");
		int num = sc.nextInt();
		
		if(num <= 0 && num >= 13) {
			System.out.println("Mes Invalido");
		}else {
			System.out.println(mes[num-1]);
		}
				
		sc.close();
	}
}
