import java.util.Scanner;
public class Main {

	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);		
	
		String produto;
		int unidades  = 0;
		double preco = 0, desconto = 0, total = 0;
	
			System.out.println("Digite o Nome do Produto: ");
			produto = sc.next();
			sc.reset();
			System.out.printf("Digite o Preço do Produto %s : %n", produto);
			preco = sc.nextDouble();
			System.out.printf("Digite quantas unidades do Produto %s : %n", produto);
			unidades = sc.nextInt();
			
			if(unidades  <= 10 ) {
				desconto = 0;
			}else if(unidades  <= 20) {
				desconto = 10;
			}else if(unidades  <= 50) {
				desconto = 20;
			}else if(unidades  > 50) {
				desconto = 25;
			}
			
			total = preco * unidades  - ( preco * unidades  * desconto / 100);
			//valorFinal = total - (total * desconto / 100);
			
			System.out.printf("O valor TOTAL de %d unidades de %s é R$%.2f ",unidades , produto,  total);
		
		sc.close();
	}
}