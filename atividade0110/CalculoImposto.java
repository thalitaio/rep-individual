/*
_ Execute o commit e push a cada etapa finalizada. OK
_ Crie uma classe para cálculo de impostos. OK
_ A classe de calculo deve possuir 3 métodos, um para calculo de ISS, outro para cálculo de IOF e outro para cálculo de IR.OK
_ A classe deve manter em variáveis privadas o valor de cada imposto que deve ser definido por você. OK
_ Os métodos devem receber como parâmetro um valor que servirá de base para cálculo do imposto e retornar o valor do imposto calculado.
_ Crie uma segunda classe que contenha o método main.
_ Nesta segunda classe, crie um objeto da classe calculadora, realize a chamada aos três métodos e ao final da execução, imprima o valor de todos os impostos calculados,.

*/

package atividade0110;

public class CalculoImposto {

    private double valor = 2000;
    private double iss = 0.04;
    private double iof = 0.0638;
    private double ir = 0.09;

    double metodoIss(double valor){
        double resultado = valor * iss;
        return resultado;
    }

    double metodoIof(double valor){
        double resultado = valor * iof;
        return resultado;
    }

    double metodoIr(double valor){
        double resultado = valor * ir;
        return resultado;
    }

    
}
