import java.util.ArrayList;
import java.util.List;

public class Cidade{
    private List<Habitante> habitantes = new ArrayList<>();

    public void registrarHabitante(int idade, char genero, double renda) {
        Habitante habitante = new Habitante(idade, genero, renda);
        habitantes.add(habitante);
    }

    public double calcularMediaSalarial() {
        double totalSalarios = 0;
        for (Habitante habitante : habitantes) {
            totalSalarios += habitante.getRenda();
        }
        return totalSalarios / habitantes.size();
    }

    public int obterMaiorIdade() {
        int maiorIdade = Integer.MIN_VALUE;
        for (Habitante habitante : habitantes) {
            if (habitante.getIdade() > maiorIdade) {
                maiorIdade = habitante.getIdade();
            }
        }
        return maiorIdade;
    }

    public int obterMenorIdade() {
        int menorIdade = Integer.MAX_VALUE;
        for (Habitante habitante : habitantes) {
            if (habitante.getIdade() < menorIdade) {
                menorIdade = habitante.getIdade();
            }
        }
        return menorIdade;
    }

    public int contarHabitantesMasculinosComSalarioAteMil() {
        int quantidade = 0;
        for (Habitante habitante : habitantes) {
            if (habitante.getGenero() == 'M' || habitante.getGenero() == 'm') {
            	if(habitante.getRenda() <= 1000) {
                quantidade++;
            	}
            }
        }
        return quantidade;
    }

    public int contarHabitantesFemininos() {
        int quantidade = 0;
        for (Habitante habitante : habitantes) {
            if (habitante.getGenero() == 'F'|| habitante.getGenero() == 'f') {
                quantidade++;
            }
        }
        return quantidade;
    }
}