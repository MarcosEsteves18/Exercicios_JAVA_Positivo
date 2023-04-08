import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double saldo = 0, saque = 0, deposito = 0;
	
		String op;
		do {
		System.out.println("Banco \n"
				+ "A - Consultar Saldo \n"
				+ "B - Saque \n"
				+ "C - Deposito \n"
				+ "D - Sair \n");
	
			op = sc.next();
		switch(op) {
		case "a":{
			System.out.println("Saldo é de R$"+saldo);
			break;
		}
		case "b":{
			System.out.println("Qual o valor de Saque: ");
			saque = sc.nextDouble();
			if(saque < saldo) {
				saldo = saldo - saque;
				System.out.println("Saque concluido! ");
			}else {
					System.out.println("Saque invalido! ");
			}
			break;
		}
		case "c":{
			System.out.println("Qual o valor de Deposito: ");
			deposito = sc.nextDouble();
			saldo = saldo + deposito;
			System.out.println("Deposito Concluido! ");
			break;
		}
		case "d":{
			System.out.println("Saindo:");
			break;
		}	
		default:{
			System.out.println("A letra escolhida nao eh Invalida!");
		}
		}
		}while(op != "d");

		
		sc.close();
	}

}
