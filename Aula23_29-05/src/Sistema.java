import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class Sistema {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/novo";
		String user = "root";
		String pass = "1234";
		
		Pessoa p1 = new Pessoa("Marcos", "email@hotmail.com");
		ArrayList<Pessoa> listaPessoa = new ArrayList<>();
		
		try {
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("CONECTADO!");
			//p1.inserirPessoa(con);
			listaPessoa = p1.listarPessoas(con);
			System.out.println(listaPessoa);
			
			con.close();
			
		}catch(SQLException ex) {
			System.out.println("Erro ao conectar no banco " + ex.getMessage());
		}
		
		
		

	}

}
