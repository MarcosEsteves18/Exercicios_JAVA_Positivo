import java.util.Scanner;
public class Indice {
	private double taxa;

	
	
	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	public void poluicao(){
		Scanner sc = new Scanner(System.in);
		
		this.taxa = 0.0;
		System.out.println("Qual o valor do indice de poluição ?");
		this.taxa = sc.nextDouble();
		if(this.taxa >= 0.06 && this.taxa <= 0.16) {
			System.out.println("O índice de poluição aceitável");
		}else if(this.taxa >= 0.25 && this.taxa <= 0.39) {
			System.out.println("indústrias do 1 grupo são intimadas a reduzirem em 50% suas atividades;");
		}else if(this.taxa >= 0.40 && this.taxa <= 0.49) {
			System.out.println("industrias do 1 e 2 grupo são intimadas a suspenderem suas atividades.");
		}else if(this.taxa >= 0.50 ) {
			System.out.println("todos os grupos devem ser notificados a paralisarem suas atividades.");
		}
	sc.close();
	}
}

