
public class House {
	private String color;
	 private Door door1;
	 private Door door2;
	 private Door door3;
	
	 public House(String color,Door door1, Door door2, Door door3) {
		 this.color = color;
		 this.door1 = door1;
		 this.door2 = door2;
		 this.door3 = door3;
	 }
	
	//public void setColor(String color) {
	//	this.color = color;
	//}
	
	public void paint(String s) {
		this.color = s;
	}
	
	 public int qhowDoorIsOpen() {
	        int count = 0;
	        if (door1.isOpen() == true) {
	            count++;
	        }
	        if (door2.isOpen() == true) {
	            count++;
	        }
	        if (door3.isOpen() == true) {
	            count++;
	        }
	        return count;
	    }
	

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		 this.color = color;
	}


    public Door getDoor1() {
        return door1;
    }

    public void setDoor1(Door door1) {
        this.door1 = door1;
    }

    public Door getDoor2() {
        return door2;
    }

    public void setDoor2(Door door2) {
        this.door2 = door2;
    }

    public Door getDoor3() {
        return door3;
    }

    public void setDoor3(Door door3) {
        this.door3 = door3;
    }
	
    public String toString() {
    	return "A cor da House eh " + this.color;
    }
	
}
