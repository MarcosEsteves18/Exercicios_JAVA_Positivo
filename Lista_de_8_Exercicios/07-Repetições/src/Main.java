import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int qtd=20;
        int numeros[] = new int[qtd];
        
        
        for(int i = 0; i < qtd; i++) {
            System.out.println("informe o " + (i+1) + "° numero");
            numeros[i] = leitor.nextInt();
        }
        for(int i = 0; i < qtd; i++) {
            boolean aux = false;
            for(int j = i+1; j < qtd; j++) {
                if(numeros[i]==numeros[j]) {    
                    aux = true;
                }
            }
            if(true!=aux) {
        System.out.print(" "+ numeros[i]);
            }
        }
      leitor.close();
    }

}