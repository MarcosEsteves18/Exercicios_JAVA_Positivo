public class Habitante {
    private int idade;
    private char genero; // 'M' para masculino e 'F' para feminino
    private double renda;

    public Habitante(int idade, char genero, double renda) {
        this.idade = idade;
        this.genero = genero;
        this.renda = renda;
    }

    
    
    //gets e sets
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}
     

}