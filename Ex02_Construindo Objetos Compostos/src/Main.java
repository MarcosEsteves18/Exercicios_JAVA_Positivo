import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Door door1 = new Door(false, "vermelho", 2,1,0.10);
		Door door2 = new Door(true, "verde", 3,1,0.20);
		Door door3 = new Door(true, "azul", 1,3,0.30);
		House House = new House("vermelha",door1,door2, door3);
		System.out.println(House);
        System.out.println(door1);
        System.out.println(door2);
        System.out.println(door3);
        System.out.println("Quantas portas estão abertas? " + House.qhowDoorIsOpen());
     
		sc.close();
	}
}
