package Programa;

public class Conta {

	public String numero;
	public String agencia;
	public double saldo;
	public double limite;
	
	
	//get ler um atributo do obj
	//set editar um atributo do obj
		
	
	public String getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getLimite() {
		return this.limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public String toString() {
		String texto = "\t" + this.agencia +"\t"+ this.numero + "\t" + this.saldo + "\t"+ this.limite;
		return texto;
	}
	
	
	
	
	
	
}
