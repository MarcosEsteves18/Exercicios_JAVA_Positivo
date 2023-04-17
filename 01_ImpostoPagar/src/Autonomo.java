import java.util.ArrayList;


public class Autonomo {
    private static final double limiteDiario = 500.00;
    private static final double multaDiaria = 0.10;

    private ArrayList<Venda> vendas;

    public Autonomo() {
        vendas = new ArrayList<>();
    }

    public void cadastrarVenda(Venda venda) {
        vendas.add(venda);
    }

    public double calcularMultaTotal(int mes, int ano) {
        double multaTotal = 0.0;
        for (Venda venda : vendas) {
            if (venda.getMes() == mes && venda.getAno() == ano && venda.getValor() > limiteDiario) {
                double excesso = venda.getValor() - limiteDiario;
                multaTotal += excesso * multaDiaria;
            }
        }
        return multaTotal;
    }
}