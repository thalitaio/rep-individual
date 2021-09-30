/*
_ Crie uma nova classe para esta atividade e que possua um método main para executar a aplicação.
_ Construa uma classe CalculadoraTaxas que possua os métodos de cálculo de taxas.
_ Crie dois métodos para cálculo de taxa sobre transações bancárias, o primeiro será aplicado uma taxa de 0,001% sobre o valor transferido, o segundo uma taxa de saque de R$1.30 a cada 5 saques realizados.
_ Na classe principal, dentro do metodo main, construa um objeto da classe Calculadora de Taxas e execute os métodos de transferência e de saque.
_ Ao final da execução do método main, imprima todos os dados das taxas cobradas. 


*/
package atividade309;

public class CalculadoraTaxas {
    private double taxaTransacao = 0.001;
    private double taxaSaque = 1.30;
    private int numSaques;

    public double taxaTransacao(double valor){
        double resultTaxaTransf = valor * (taxaTransacao / 100);
        return resultTaxaTransf;
    }

    public double taxaSaque(double valor){
        numSaques ++;
        if (numSaques % 5 == 0) {
            return taxaSaque;
        }
        return 0;
    }

}  
