
import java.util.Scanner;
import java.util.ArrayList;

public class Estoque {
	

	private ArrayList<Ferramenta> ferramentas = new ArrayList<>();
	
	public Estoque() {}

	public Estoque(ArrayList<Ferramenta> ferramenta) {
		this.ferramentas = ferramenta;
	}

	

	public ArrayList<Ferramenta> getFerramenta() {
		return ferramentas;
	}

	public void setFerramenta(ArrayList<Ferramenta> ferramentas) {
		this.ferramentas = ferramentas;
	}
	
	public void adicionarFerramenta(Ferramenta ferramenta) {
		boolean cadastrado = false;
		for(Ferramenta f : ferramentas) {
			if(f.getCodigo() == ferramenta.getCodigo()) {
				cadastrado = true;
				break;
			}
		}
		if(!cadastrado) {
			ferramentas.add(ferramenta);
			System.out.println("Ferramenta Cadastrada! \n");
		}else {
			System.out.println("Ferramenta Cod: " + ferramenta.getCodigo() + ", Nome: "  + ferramenta.getNome() + " Já foi cadastrada! \n");
		}
	}
			
	public void listarEstoque() {
		for(Ferramenta f : ferramentas) {
			System.out.println(f.toString());
		}
	}
	
	public void editarFerramenta(int codigo) {
		Scanner sc = new Scanner(System.in);
		for(Ferramenta f : ferramentas) {
			if(f.getCodigo()== codigo && f.getDisponivel() == true) {
				System.out.println("Qual o nome da Ferramenta: ");
				f.setNome(sc.nextLine());
				sc.reset();
				System.out.println("Qual o valor de custo da Ferramenta: ");
				f.setValorCusto(sc.nextDouble());
				System.out.println("Qual o corredor da Ferramenta: ");
				f.setCorredor(sc.next());
				sc.reset();
				System.out.println("Qual o rua da Ferramenta: ");
				f.setRua(sc.next());
				sc.reset();
				System.out.println("Ferramenta "+ f.getNome() + " Editada com sucesso!!!");
				sc.close();
				break;
			}else {
				System.out.println("Ferramenta nao encontrada");
			}
		}
	}
	
	public void listarFerramentaEmprestada() {
		for(Ferramenta f : ferramentas) {
			if(f.getDisponivel() == false) {
				System.out.println("Ja esta Emprestada a Ferramenta: " + f.getCodigo() +", "+ f.getNome());
			}
		}
	}
	
	public void emprestarFerramenta(int codigo) {
		for(Ferramenta f : ferramentas) {
			if(f.getCodigo()== codigo && f.getDisponivel()) {
				f.setDisponivel(false);
				System.out.println("Ferramenta "+ f.getNome() + " Emprestado com sucesso!!!");
				break;
			}else {
				System.out.println("Ferramenta nao encontrada");
			}
		}
	}
	
	public void devolverFerramenta(int codigo) {
		for(Ferramenta f : ferramentas) {
			if(f.getCodigo()== codigo && f.getDisponivel() == false) {
				f.setDisponivel(true);
				System.out.println("Ferramenta "+ f.getNome() + " Devolvida com sucesso!!!");
				break;
			}else {
				System.out.println("Ferramenta nao encontrada");
			}
		}
	}
	
	
	public void removerFerramenta(int codigo) {		
		for(Ferramenta f : ferramentas) {
			if(f.getCodigo() == codigo) {
				ferramentas.remove(f);
				   System.out.println("Removido com Sucesso!!! " + f.getCodigo() + ", " + f.getNome());
				   break;
			}else {
				System.out.println("Ferramenta nao encontrada");
			}
		}
	}
	
}