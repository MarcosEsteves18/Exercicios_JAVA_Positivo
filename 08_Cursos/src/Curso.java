import java.util.List;
import java.util.ArrayList;
public class Curso {
    private String nome;
    private Instrutor instrutor;
    private List<Aluno> alunos = new ArrayList<>();

    //construtor
    public Curso(String nome, Instrutor instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public void matricularAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    
    
    //gets e sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Instrutor getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

}