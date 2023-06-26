
public class Ferramenta {

	private int codigo;
	private String nome;
	private double valorCusto;
	private String corredor;
	private String rua;
	private boolean disponivel = true;
	public String disp;
	
	public Ferramenta() {};
	
	public Ferramenta(int codigo, String nome, double valorCusto, String corredor, String rua ) {
		this.codigo = codigo;
		this.nome = nome;
		this.valorCusto = valorCusto;
		this.corredor = corredor;
		this.rua = rua;
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getValorCusto() {
		return valorCusto;
	}

	public void setValorCusto(double valorCusto) {
		this.valorCusto = valorCusto;
	}

	public String getCorredor() {
		return corredor;
	}

	public void setCorredor(String corredor) {
		this.corredor = corredor;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public boolean getDisponivel() {
		return disponivel;
	}
	
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
		@Override
	public String toString() {
		return "Ferramenta Codigo: " + codigo + ", Nome: " + nome + ", Valor de Custo: " + valorCusto + ", Corredor: " + corredor + ", Rua: " + rua + "Disponivel: "+ (getDisponivel()?"SIM":"NÃO") +".\n";
	}	
	
	
	
}