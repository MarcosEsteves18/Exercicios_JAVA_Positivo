public class Pessoa {
    private String cpf;

    public Pessoa(String cpf) {
        if (cpf == null) {
            System.out.println("CPF não pode ser nulo");
        }
       
        if (cpf.length() != 11) {
        	System.out.println("CPF inválido");
        }
        else {
          System.out.println("Pessoa criada com sucesso!");
          this.cpf = cpf;
        }
    }

    // Getters e setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}