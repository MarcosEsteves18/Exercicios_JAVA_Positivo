
public class Main {

	public static void main(String[] args) {
		
		
		Door door = new Door(false, "vermelho", 2,1,0.10);
		System.out.println(door);
		
		if(door.isOpen() == true) {
			System.out.println("ESTA ABERTA");
		}else if(door.isOpen() == false) {
			System.out.println("ESTA FECHADA");
		}
		
		door.open();
		System.out.println(door);
		
		if(door.isOpen() == true) {
			System.out.println("ESTA ABERTA");
		}else if(door.isOpen() == false) {
			System.out.println("ESTA FECHADA");
		}
	}

}
