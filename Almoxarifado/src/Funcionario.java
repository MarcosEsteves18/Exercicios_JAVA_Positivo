
public class Funcionario implements Login{

	private String codigo;
	private String nome;
	private String funcao;
	private String setor;
	private String cpf;
	private String senha;
	
	public Funcionario() {}

	public Funcionario(String codigo, String nome, String funcao, String setor, String cpf, String senha) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.funcao = funcao;
		this.setor = setor;
		this.cpf = cpf;
		this.senha = senha;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getSenha() {
		return senha;
	}

	
	public boolean login(String id, String senha) {
		if(id.equals(getCodigo()) && senha.equals(getSenha())) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Funcionario Codigo: " + codigo + ", Nome: " + nome + ", Funcao: " + funcao + ", setor: " + setor + ", cpf: "
				+ cpf + ".";
	}
	
	
	
	
	
}