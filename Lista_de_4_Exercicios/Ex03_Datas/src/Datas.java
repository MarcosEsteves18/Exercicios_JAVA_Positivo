
public class Datas {
	private int dia; 
	private int mes; 
	private int ano; 
	
	public Datas(int dia, int mes, int ano) {
		if(this.ano >= 1 || this.ano <= 9999) {
			this.ano = ano;
		} 
		if(this.dia >= 1 || this.dia <= 31) {
			this.dia = dia;
		}
		if(this.mes >= 1 || this.mes <= 12) {
			this.mes = mes;
			this.dia = dia;
		}else {
			System.out.println("Data Invalida!!!");
		}
		
	}
		
	

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void AvacarDia() {
		if(this.dia < 31) {
			this.dia = this.dia+1;
		}else {
			this.mes = this.mes+1;
			this.dia = 1;
			if(this.mes == 13) {
				this.mes = 1;
				this.ano = this.ano +1;
			}
		}
	}
	
	public String toString() {
		return this.dia +"/"+ this.mes + "/" + this.ano;
	}
}	
