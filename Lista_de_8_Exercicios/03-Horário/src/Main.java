import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int segundos = 0, h = 0, m = 0, s = 0, resto = 0;
		System.out.println("Digite uma quantidade em segundos: ");
		segundos = sc.nextInt();
		
		    h = segundos / 3600;
		    resto = segundos % 3600;
		    m = resto / 60;
		    s = resto % 60;
		    
		    System.out.printf("%d:%d:%d\n", h, m, s);
		
		sc.close();
	}

}
