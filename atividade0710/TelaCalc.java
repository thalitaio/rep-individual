/*
 Crie uma classe Tela com um método main, crie um objeto da classe Calculadora, chame cada método criado e imprima seus resultados.
*/

package atividade0710;

public class TelaCalc {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        double c1 = calc.soma(6.5, 6);
        double c2 = calc.soma(10, 11);
        float c3 = calc.soma(10.3f, 4.3f, 8.5f);
        long c4 = calc.soma(105, 45, 33);

       System.out.println(c1);
       System.out.println(c2);
       System.out.println(c3);
       System.out.println(c4);

    }
}
