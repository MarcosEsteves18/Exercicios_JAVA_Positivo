
public class Programa {

	public static void main(String[] args) {
		Juros boleto1 = new Juros(259.90, 2);
		
		System.out.printf("Um boleto no valor de R$%.2f com %d dias de atraso deve ser"
				+ " recalculado em R$%.2f",+boleto1.getValorBoleto(), boleto1.getDia(),boleto1.jurosComposto());
		
	}

}
