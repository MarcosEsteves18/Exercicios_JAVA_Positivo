import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Door door = new Door();
		int num = 0;
		
		do{
			System.out.println("Digite uma cor para pintar a porta : ");
			door.paint(sc.next());
			sc.reset();
			
			System.out.println("Digite 1 se quer editar a porta e 0 para nao editar a cor da porta : ");
			num = sc.nextInt();
		
		}while(num != 0);
		
		System.out.println("Digite o largura da porta : ");
		door.setWidth(sc.nextDouble());
		System.out.println("Digite o altura da porta : ");
		door.setHeight(sc.nextDouble());
		System.out.println("Digite a profundidade da porta : ");
		door.setDepth(sc.nextDouble());
		
		System.out.println("A porta está ? ");
		String esta = sc.next();
		String isto = "aberta";
		sc.reset();
		if(esta.equalsIgnoreCase(isto)) {
			door.open();
		}else {
			door.close();
		}
		
		System.out.print(door.toString());
		
		
		
		sc.close();

	}

}
