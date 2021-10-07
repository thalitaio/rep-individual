/*
_ Adicione a classe Calculadora um método soma que recebe dois parâmetros e inteiros e retorna um inteiro com o resultado.
_ Adicione a classe Calculadora um método soma que recebe dois parâmetros double e retorna um double com o resultado.
_ Adicione a classe Calculadora um método soma que recebe três parâmetros float e retorna um float com o resultado.
_ Adicione a classe Calculadora um método soma que recebe três parâmetros long e retorna um long com o resultado.
_ Crie uma classe Tela com um método main, crie um objeto da classe Calculadora, chame cada método criado e imprima seus resultados.
*/

package atividade0710;

public class Calculadora {
    public int soma( int a, int b) {
        return a + b;
    }

    public double soma(double a, double b) {
        return a + b;
    }

    public float soma(float a, float b, float c) {
        return a + b + c;
    }

    public long soma(long a, long b, long c){
        return a + b + c;
    }
}
