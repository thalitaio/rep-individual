package atividade1810;
//número de portas e capacidade do porta-malas.
public class Carro {
    public int numero_portas;
    public double porta_mala;

    @Override
    public String toString() {
        return "\n" + this.numero_portas + "\n" + this.porta_mala;
    }
}
