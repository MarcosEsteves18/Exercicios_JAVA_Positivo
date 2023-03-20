import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        int qtd = 4; 
        double preco1[] = new double[qtd];
        double preco2[] = new double[qtd];
        double resultante[] = new double[qtd];
        
        for(int i = 0; i < qtd; i++) {
            System.out.printf("Digite o %d° numero do array preço1: ", i);
            preco1[i] = sc.nextDouble();
            
            System.out.printf("Digite o %d° numero do array preço2: ", i);
            preco2[i] = sc.nextDouble();
                
            if(preco1[i] < preco2[i]) {
                resultante[i] = preco1[i];
            }else {
                resultante[i] = preco2[i];
            }
            
        }
        
        for(int i = 0; i < qtd; i++) {
            System.out.println("Resultante " + resultante[i]);
        }
        
        
        
        sc.close();
    }

}