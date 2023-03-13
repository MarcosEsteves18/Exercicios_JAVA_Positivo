import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de alunos da turma: ");
		int qtd = sc.nextInt();
		sc.reset();
		
		int indexMaior = 0, indexMenor = 0;
		String alunos[] = new String[qtd];
		double notas[][] = new double[qtd][3];
		
		for(int i = 0; i < qtd ; i++) {
			System.out.println("Digite o nome do Aluno "+ i +":");
			alunos[i] = sc.next();
			sc.reset();
			System.out.println("Digite a nota 1 do(a) aluno(a) "+ alunos[i] +":");
			notas[i][0] = sc.nextDouble();
			sc.reset();
			System.out.println("Digite a nota 2 do(a) aluno(a) "+ alunos[i] + ":");
			notas[i][1] = sc.nextDouble();
			sc.reset();
			
			notas[i][2] = ( notas[i][0] + notas[i][1] ) / 2 ;
			
			// ver quem é menor
			if( notas[i][2] < notas[indexMenor][2] ) {
				indexMenor = i;
			}
			//ver quem é maior
			if( notas[i][2] > notas[indexMenor][2] ) {
				indexMaior = i;
			}
	
				
		}
		
		System.out.println("A Maior nota é do(a) Aluno(a) " + alunos[indexMaior] + " Nota: " + notas[indexMaior][2] );
		System.out.println("A Menor nota é do(a) Aluno(a) " + alunos[indexMaior] + " Nota: " + notas[indexMenor][2] );
		sc.close();
	}

}
