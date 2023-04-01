package Programa;

import java.util.Locale;
import java.util.Scanner;
import java.util.Calendar;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ArrayList <Clientes> listaClientes = new ArrayList <>();
		ArrayList <Conta> listaConta = new ArrayList <>();
		
		String menu = "\t BANCO SANTO ANDRE \n"
				+ "\n"
				+ "1 -\t CADASTRAR CLIENTE \n"
				+ "2 -\t CADASTRAR CONTA \n"
				+ "3 -\t LITAR  CLIENTE \n"
				+ "4 -\t LISTA  CONTA \n"
				+ "5 -\t EDITAR CLIENTE \n"
				+ "6 -\t EDITAR CONTA \n"
				+ "0 -\t SAIR";
		
		int option = 0;
		
		do {
			System.out.println(menu);
			option = sc.nextInt();
			sc.reset();
			
			switch(option) {
			case 1:
				Clientes clientes = new Clientes();
				
				System.out.print("Digite o nome do Cliente: ");
				clientes.setNome(sc.next());
				sc.reset();
				
				System.out.print("Digite o numero do CPF :");
				clientes.setCpf(sc.next());
				sc.reset();
				
				System.out.print("Digite o endereço do Cliente :");
				clientes.setEndereco(sc.next());
				sc.reset();
				
				System.out.println("Digite a data de nascimento do Cliente ");
				System.out.print("Digite o Ano de nacimento do Cliente :");
				int ano = sc.nextInt();
				System.out.print("Digite o Mes de nacimento do Cliente :");
				int mes = sc.nextInt();
				System.out.print("Digite o Dia de nacimento do Cliente : ");
				int dia = sc.nextInt();
				clientes.getNascimento().set(ano, mes, dia);
				
				listaClientes.add(clientes);
				
				break;
				
			case 2: 
				if(listaClientes.size() > 0) {
					int cod = 0;
					System.out.println("Qual o cliente da conta? ");
					for(Clientes c : listaClientes) {
						System.out.println(cod + " - " + c.getNome());
						cod++;
					}
					cod = sc.nextInt();
					
					Conta conta = new Conta();
					
					System.out.println("Digite o Numero da Conta do Cliente :");
					conta.setNumero(sc.next());
					
					System.out.println("Digite o Numero da Agencia da Conta :");
					conta.setAgencia(sc.next());
				
					conta.setSaldo(0.0);
					conta.setLimite(1000);
						
					listaClientes.get(cod).addConta(conta);
				}else {
					System.out.println("NAO EXISTE NENHUM CLIENTE CADATRADADO AINDA!");
				}
			
				
				break;
				
			case 3:	
				for(Clientes c: listaClientes)
					for(Conta conta: c.getContas()) {
						System.out.println(conta.toString());
					}
				break;
				
			case 4:
				System.out.println("Numero \t Agencia \t Saldo \t Limite");
				for(Conta item : listaConta)
				break;
				
			case 5:
				
				break;
				
			case 6:
			
				break;
				
			case 0:
				System.out.println("SAINDO DO SISTEMA!");
				break;
				
			default:
				System.out.println("opção inválida");
			}
			
			
			
			
		}while(option != 0);
		sc.close();
	}

}
