public class Door {

	public boolean open;
	public String color;
	public double width;
	public double height;
	public double depth;
	
	//get ler um atributo do obj
	//set editar um atributo do obj
	
	public Door(boolean open, String color, double width, double height, double depth) {
		this.open = open;
		this.color = color;
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	public double getWidth() {
		return this.width;
	}
	public void setWidth(double width){
		this.width = width;
	}
	
	public double getHeight(){
		return this.height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getDepth() {
		return this.depth;
	}
	public void setDepth(double depth) {
		this.depth = depth;
	}
	
	
	public void open() {
		 this.open = true;
	}
	
	
	public void close() {
		 this.open = false;
	}
	
	
	public void paint(String s) {
		this.color = s;
	}
	
	
	public boolean isOpen() {
		return open;

	}
	
	public String toString() {
		
		String texto = "A cor da porta é " + this.color + ", e a largura da porta é " + this.width +", e a altura da porta é " + this.height + ", e a porfundidade da porta é "+ this.depth + " a porta ela está " + isOpen() + " : aberta(true) ou fechada(false) ";
		return texto;
	}
}
