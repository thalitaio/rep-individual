package atividade0610;

//atributos privados: taxa transferência, taxa manutenção e número de transferências. 
//Defina um valor padrão para taxa de transferência de R$10.50, um valor de R$2.50 para taxa de manutenção e 0 para o número de transferências;
public class ContaCorrente extends Conta {
    private double taxa_transferencia;
    private double taxa_manutencao;
    private double numero_transferencia;

    public void setTaxa_transferencia(double taxa_transferencia) {
        this.taxa_transferencia = 10.50;
    }
    public double getTaxa_transferencia() {
        return taxa_transferencia;
    }

    public void setTaxa_manutencao(double taxa_manutencao) {
        this.taxa_manutencao = 2.50;
    }
    public double getTaxa_manutencao() {
        return taxa_manutencao;
    }

    public void setNumero_transferencia(double numero_transferencia) {
        this.numero_transferencia = 0;
    }
    public double getNumero_transferencia() {
        return numero_transferencia;
    }

}
