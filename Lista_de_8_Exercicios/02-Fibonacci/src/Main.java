import java.util.Scanner;
public class Main {

	public static void main(String arg[]) { 
		Scanner sc = new Scanner(System.in);
		
		int num=0, fi=0, f1=1, f2=1, ax=999;           
	    System.out.println("Informe um numero inteiro para saber se é da sequência de Fibonacci");            
	    num = sc.nextInt();  
	    
	    while (fi < num) {  // 0 < 3              
	    	fi = f1 + f2; // soma (f1 + f2) e guardar em fi           
	    	f1 = f2;  // coloco o valor de f2 em f1                 
	    	f2 = fi;  // coloco o valor de fi em f2                
	    }	
	    if (fi == num) {              
	    	ax = 0;                     
	    }
	    if (ax == 0) {                
	    	System.out.println("O Numero " + num + ", Faz parte da sequência de fibonacci" );             
	    }else {           
	    	System.out.println("O Numero " +num + ", Não faz parte da sequência de fibonacci" );
	    }
		
	    sc.close();
	}

}

