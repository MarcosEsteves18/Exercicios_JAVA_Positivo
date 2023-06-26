
public class Eletrica extends Ferramenta{

	
	public Eletrica() {
		super();
		
	}

	public Eletrica(int codigo, String nome, double valorCusto, String corredor, String rua) {
		super(codigo, nome, valorCusto, corredor, rua);
		// TODO Auto-generated constructor stub
	}
	
	public String modoDeUsar() {
		  String modoDeUsar = "As ferramentas elétricas, como o nome já indica, são todos os equipamentos que utilizam como fonte de sua potência a energia elétrica. Podem ser desde versões de ferramentas originalmente manuais (como a plaina) ou equipamentos que já nasceram para funcionar direto na tomada (como a furadeira).";
		  return modoDeUsar ;
	}

	
	@Override
	public String toString() {
		return "Ferramenta do Tipo Eletrica Codigo: " + getCodigo() + ", Nome: " + getNome() + ", Valor Custo: "
					+ getValorCusto() + ", Corredor: " + getCorredor() + ", Rua: " + getRua() + ", Disponivel: "
					+ (getDisponivel()?"SIM":"NÃO") + ". \n" + "ModoDeUsar: " + modoDeUsar() + ". \n";
	}

		
	}

	
	
