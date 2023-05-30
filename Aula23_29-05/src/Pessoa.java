import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Pessoa {
	private int id;
	private String nome;
	private String email;

	public Pessoa(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void inserirPessoa(Connection con) {
		String sql = "INSERT INTO pessoa (nome, email) VALUE (?, ?)";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, this.nome);
			ps.setString(2, this.email);
			boolean insert = ps.execute();
			if(!insert) {
				System.out.println("Inserido Com Sucesso!");
			}else {
				System.out.println("ERRO no comando INSERT");
			}
			
		} catch(SQLException ex) {
			ex.printStackTrace();
			System.out.println("ERRO ao inserir pessoa");
		}
	}
	
	public ArrayList<Pessoa> listarPessoas(Connection con){
		ArrayList<Pessoa> listaPessoa = new ArrayList<>();
		
		try {
			PreparedStatement ps = con.prepareStatement(
					"SELECT * FROM pessoa");
			ResultSet resultado = ps.executeQuery();
			while(resultado.next()) {
				Pessoa pTemp = new Pessoa(resultado.getString("nome"), 
						resultado.getString("email"));
				pTemp.id = resultado.getInt("id");
				listaPessoa.add(pTemp);
			}
			
		} catch(SQLException ex) {
			ex.printStackTrace();
			System.out.println("ERRO ao listar Pessoas");
		}
		return listaPessoa;
		
	}
	
	
	@Override
	public String toString() {
		return "Pessoa Id:" + this.id + ", Nome:" + this.nome + ", E-mail:" + this.email + ".";
	}
	
	
	
	
	
}
