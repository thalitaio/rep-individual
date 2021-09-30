/*
_ Crie uma nova classe para esta atividade e que possua um método main para executar a aplicação.
_ Construa uma classe CalculadoraTaxas que possua os métodos de cálculo de taxas.
_ Crie dois métodos para cálculo de taxa sobre transações bancárias, o primeiro será aplicado uma taxa de 0,001% sobre o valor transferido, o segundo uma taxa de saque de R$1.30 a cada 5 saques realizados.
_ Na classe principal, dentro do metodo main, construa um objeto da classe Calculadora de Taxas e execute os métodos de transferência e de saque.
_ Ao final da execução do método main, imprima todos os dados das taxas cobradas. 


*/
package atividade309;
import java.util.Scanner;


public class CalculadoraTaxas {
    private double valorInicial;

    Scanner sc = new Scanner(System.in);

    public void mensagem(){
        System.out.println("Digite a transação desejada");
        System.out.println("D1 -- Transferência  ||  2 -- Saque");
        int opcaoMenu = sc.nextInt();

        switch (opcaoMenu) {
            case 1:
            System.out.println("Digite o valor:");
            double valor = sc.nextInt();
            System.out.println(taxaTransacao(valorInicial, valor)); 
        
            default:
                break;
        }
    }

    public double taxaTransacao(double valorInicial, double valor){
        double resultTaxaTransf = valor - (valor * 0.001 / 100);
        double novoSaldo = resultTaxaTransf;
        return valorInicial + resultTaxaTransf;
    }

    public double tacaSaque(){
        int numSaques = 5;
        if (numSaques > 4) {
            valorInicial =  valorInicial - 1.30;
        }
        return valorInicial;
    }
}
