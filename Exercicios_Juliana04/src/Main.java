//Aula 04
import java.util.Scanner;
public class Main {


	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0;
		double numero[];
		numero = new double[10]; 
		double soma = 0, media = 0, maior = 0;
		
		//declarando os numeros.
		for(i = 0 ; i <= 9; i++){
			System.out.printf("Digite o numero[%d] : \n", i);
			numero[i] = sc.nextDouble();
			soma = soma +numero[i];
			
		}
		System.out.println();
		
		//imprimindo os numeros.
		for(i = 0 ; i <= 9; i++){
			System.out.printf("Numero digitado no Array [%d] : %.2f \n",i, numero[i]);
			
		}
		System.out.println();
		
		//soma.
		System.out.printf("SOMA : %.02f \n", soma);
		System.out.println();
		
		//media.
		media = soma / 10;
		System.out.printf("MEDIA : %.2f \n", media);
		System.out.println();
		
		//maior
			for(i = 0 ; i <= 9; i++){
				if(numero[i] > maior) {
					maior = numero[i];
					}	
			}
			System.out.printf("MAIOR NUMERO : %.2f \n", maior);
			System.out.println();
			
		//menor
			double menor = maior;
			for(i = 0 ; i <= 9; i++){
				if(numero[i] < menor) {
					menor = numero[i];
					}
			}
			System.out.printf("MENOR NUMERO : %.2f \n", menor);
			System.out.println();
	
		
		sc.close();
	}

}