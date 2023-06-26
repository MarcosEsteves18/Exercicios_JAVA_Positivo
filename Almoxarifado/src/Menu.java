import java.util.Locale;
import java.util.Scanner;

public  class Menu {
	public void meuMenu(){
		Estoque estoque = new Estoque();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int num = 0;

		String texto = "\t Almoxarifado \n" + "1- Cadastrar Ferramenta \n" + "2- Listar Ferramentas \n"
				+ "3- Editar Ferramenta \n" + "4- Emprestar Ferramenta \n" + "5- Devolver Ferramenta \n"
				+ "6- Listar Ferramenta Emprestada\n" + "7- Remover Ferramenta \n" + "0 - SAIR";

		do {
			System.out.println(texto);
			
				num = sc.nextInt();

				switch (num) {
				case 1:
					System.out.println("Qual Ferramenta voce quer cadastrar? Manual ou Eletrica? ");
					String ferramenta = sc.next();
					sc.reset();
					if (ferramenta.equals("Manual")) {
						Manual manual = new Manual();
						System.out.println("Codigo da Ferramenta: ");
						manual.setCodigo(sc.nextInt());
						System.out.println("Nome da Ferramenta: ");
						manual.setNome(sc.next());
						sc.reset();
						System.out.println("Qual o Valor de Custo da Ferramenta: ");
						manual.setValorCusto(sc.nextDouble());
						System.out.println("Qual Corredor ela esta guardada :");
						sc.nextLine();
						manual.setCorredor(sc.nextLine());
						System.out.println("Qual Rua ela esta guardada :");
						manual.setRua(sc.nextLine());
						sc.reset();

						System.out.println(manual.toString() + "Adicionada ao estoque com Sucesso!");
						estoque.adicionarFerramenta(manual);

					} else if (ferramenta.equals("Eletrica")) {
						Eletrica eletrica = new Eletrica();
						System.out.println("Codigo da Ferramenta: ");
						eletrica.setCodigo(sc.nextInt());
						System.out.println("Nome da Ferramenta: ");
						eletrica.setNome(sc.next());
						sc.reset();
						System.out.println("Qual o Valor de Custo da Ferramenta: ");
						eletrica.setValorCusto(sc.nextDouble());
						System.out.println("Qual Corredor ela esta guardada :");
						sc.nextLine();
						eletrica.setCorredor(sc.nextLine());
						System.out.println("Qual Rua ela esta guardada :");
						eletrica.setRua(sc.nextLine());
						sc.reset();

						System.out.println(eletrica.toString() + " Adicionada ao estoque com Sucesso!");
						estoque.adicionarFerramenta(eletrica);

					} else {
						System.out.println("Opção Invalida");
					}
					break;
				case 2:
					System.out.println("Ferramentas do Estoque: ");
					estoque.listarEstoque();

					break;
				case 3:
					System.out.println("Digite o Codigo da Ferramenta para Editar: ");
					int codigo5 = sc.nextInt();
					estoque.editarFerramenta(codigo5);

					break;
				case 4:
					System.out.println("Digite o Codigo da Ferramenta para Emprestar: ");
					int codigo1 = sc.nextInt();
					estoque.emprestarFerramenta(codigo1);

					break;
				case 5:
					System.out.println("Digite o Codigo da Ferramenta para Devolver: ");
					int codigo2 = sc.nextInt();
					estoque.devolverFerramenta(codigo2);

					break;
				case 6:
					System.out.println("Ferramentas do Estoque Emprestada: ");
					estoque.listarFerramentaEmprestada();
					break;
				case 7:
					System.out.println("Digite o Codigo da Ferramenta para Remover: ");
					int codigo3 = sc.nextInt();
					estoque.removerFerramenta(codigo3);
					break;
				case 0:
					System.out.println("Saindo!!");
					break;
				default:
					System.out.println("Opção invalida!");

				}

			
		} while (num != 0);

		sc.close();
	}

}