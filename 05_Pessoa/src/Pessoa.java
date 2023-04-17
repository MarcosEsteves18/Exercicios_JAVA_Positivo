public class Pessoa {
    private String cpf;
    private int idade;

    public Pessoa(String cpf) {
        this.cpf = cpf;
    }

    public Pessoa(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }
}