import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double anual = 0, rendimento = 0, imposto = 0, aliquota = 0;
		System.out.println("Digite o valor anual de rendimento: ");
		anual = sc.nextDouble();
		rendimento = anual / 12;
		
		if(rendimento <= 1200 ) {
			aliquota = 0;
		}else if((rendimento >= 1201 && rendimento <= 2300)) {
			aliquota = 7.5;
		}else if((rendimento >= 2301) && (rendimento <= 3700)) {
			aliquota = 12.5;
		}else if((rendimento >= 3701) && (rendimento <= 5100)) {
			aliquota = 17.5;
		}else if(rendimento > 5100) {
			aliquota = 27.5;
		}
		
		imposto = rendimento * aliquota / 100;
		System.out.println("Imposto a ser pago eh R$" +imposto);
		
		
		sc.close();
	}

}
