public class Logar {
	
	public void autenticaUsuario(Login auth, String id, String senha) {
		if(auth.login(id, senha)) {
			System.out.println("Usuário autenticado");
		}else {
			System.out.println("ERRO ao autenticar o usuário");
		}
	}
}