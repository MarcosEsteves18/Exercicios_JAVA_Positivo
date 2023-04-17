public class Programa {
    public static void main(String[] args) {
        Instrutor instrutorJava = new Instrutor("João", 35, "123456789");
        Instrutor instrutorPython = new Instrutor("Ana", 27, "987654321");

        Aluno aluno1 = new Aluno("Pedro", 20, "111222333");
        Aluno aluno2 = new Aluno("Maria", 22, "444555666");
        Aluno aluno3 = new Aluno("José", 19, "777888999");

        Curso javaBasico = new Curso("Java Básico", instrutorJava);
        Curso pythonBasico = new Curso("Python Básico", instrutorPython);

        javaBasico.matricularAluno(aluno1);
        javaBasico.matricularAluno(aluno2);
        pythonBasico.matricularAluno(aluno2);
        pythonBasico.matricularAluno(aluno3);

        System.out.println("Alunos matriculados em Java Básico:");
        for (Aluno aluno : javaBasico.getAlunos()) {
            System.out.println(aluno.getNome());
        }
        System.out.println("Instrutor: " + javaBasico.getInstrutor().getNome());

        System.out.println("Alunos matriculados em Python Básico:");
        for (Aluno aluno : pythonBasico.getAlunos()) {
            System.out.println(aluno.getNome());
        }
        System.out.println("Instrutor: " + pythonBasico.getInstrutor().getNome());
    }
}