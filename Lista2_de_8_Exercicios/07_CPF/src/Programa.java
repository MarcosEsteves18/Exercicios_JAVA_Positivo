
import java.util.Scanner;
public class Programa {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("CPF: ");
        String cpf = sc.nextLine();	
        sc.reset();
        Pessoa pessoa = new Pessoa(cpf);
        sc.close();
	}
}