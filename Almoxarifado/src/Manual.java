
public class Manual extends Ferramenta{

	
	public Manual() {
		super();
		
	}

	public Manual(int codigo, String nome, double valorCusto, String corredor, String rua) {
		super(codigo, nome, valorCusto, corredor, rua);
		
	}
	
	public String modoDeUsar() {
		  String modoDeUsar = "Sao ferramentas manuais necessita do esforço humano para desempenhar a atividade que ela foi criada para realizar o trabalho ";
		  return modoDeUsar ;
	}

	@Override
	public String toString() {
		return "Ferramenta do Tipo Manual Codigo: " + getCodigo() + ", Nome: " + getNome() + ", Valor Custo: "
				+ getValorCusto() + ", Corredor: " + getCorredor() + ", Rua: " + getRua() + ", Disponivel: "
				+ (getDisponivel()?"SIM":"NÃO")  + ". \n" + "ModoDeUsar: " + modoDeUsar() + ". \n";
	}

	
}