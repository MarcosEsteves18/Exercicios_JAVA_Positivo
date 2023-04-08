import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data, diames, dia, ano, mes;
		System.out.println("Digite uma data no formato (dia/mes/ano)");
		data = sc.nextInt();
		sc.close();
		
		diames = data / 100;
		mes = diames % 100;
		dia = diames /100;
		ano = data % 100;
		
		
		
		if((mes >= 1 ) && (mes <=12)) {
			System.out.println("Mes Valido");
		}else {
			System.out.println("Mes Invalido!");
		}
		
		
		if((ano % 4 == 0) && (ano % 100 != 0)) {		
			System.out.println("Ano eh bissexto");
			if(mes == 2) {
				if((dia >= 1) && (dia <=29)) {
					System.out.println("Dia Valido desse ano!");
				}else {
					System.out.println("Dia Invalido desse ano!");
				}
			}
			
		}else {
			System.out.println("Ano Nao eh bissexto");
			if(mes == 2) {
				if((dia >= 1) && (dia <=28)) {
					System.out.println("Dia Valido desse ano!");
				}else {
					System.out.println("Dia Invalido desse ano!");
				}
			}
		}
		
		
		
		
		
		
		
		sc.close();
	}

}
