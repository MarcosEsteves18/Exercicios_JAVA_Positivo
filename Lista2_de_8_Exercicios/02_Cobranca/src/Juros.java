
public class Juros {
	private double valorBoleto;
	private int dia;
	
	public Juros(double valorBoleto, int dia) {
		this.valorBoleto = valorBoleto;
		this.dia = dia;
	}
	
	
	public double getValorBoleto() {
		return valorBoleto;
	}
	public void setValorBoleto(double valorBoleto) {
		this.valorBoleto = valorBoleto;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public double jurosComposto() {
		 if(this.dia > 1) {
			 this.valorBoleto = this.valorBoleto + (5  * this.valorBoleto / 100);
			 this.valorBoleto = this.valorBoleto + (this.dia  * this.valorBoleto / 100);
			 //for(int cont = 0; cont <= this.dia; cont++) {
				// this.valorBoleto = this.valorBoleto + (1 * this.valorBoleto /100) ;
			// }
			 
		 }
		return this.valorBoleto;
	}
	
	
}
