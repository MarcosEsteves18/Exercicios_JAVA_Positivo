
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Menu meu = new Menu();
		int aux = 0;

		// int codigo, String nome, String funcao, String setor, String cpf
		Funcionario admin = new Funcionario("16713", "Marcelo", "Almoxarife", "Almoxarifado", "01234567891",
				"senha123");

		System.out.println("Sistema de Almoxarifado \n" + "Digite seu usuário para fazer login: ");
		String id = sc.next();
		System.out.println("Digite sua senha para fazer login: ");
		String senha = sc.next();
		Logar logar = new Logar();
		logar.autenticaUsuario(admin, id, senha);

		if (admin.login(id, senha) == true) {
			for(int i = 0; i<10; i++)
				try {
					meu.meuMenu();
				break;
				} catch (InputMismatchException e) {
					System.out.println("ERROR!");
				}
			
		} else {
			System.out.println("Usuario Nao tem Permissao!");
		}
	}

}