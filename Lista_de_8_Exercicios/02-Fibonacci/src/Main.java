import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = 1 , b = 0, aux = 0;
		int num = sc.nextInt();
		
		for(int i = 0; i < 20; i++) {
			//System.out.println(a);
			aux = a;
			a = a + b;
			b = aux;
			
			if(num == a) {
				System.out.println("Numero faz parte da sequência de Fibonacci.");
			}
		}
	
		
		sc.close();
	}

}
