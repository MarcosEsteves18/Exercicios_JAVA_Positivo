public class Programa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("123.456.789-10");
        Pessoa pessoa2 = new Pessoa(30);

        System.out.println("CPF da pessoa1: " + pessoa1.getCpf());
        System.out.println("Idade da pessoa1: " + pessoa1.getIdade());

        System.out.println("CPF da pessoa2: " + pessoa2.getCpf());
        System.out.println("Idade da pessoa2: " + pessoa2.getIdade());
    }
}