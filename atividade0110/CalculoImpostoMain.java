package atividade0110;

import java.util.Scanner;

public class CalculoImpostoMain {
    public static void main(String[] args) {
        CalculoImposto calc = new CalculoImposto();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor total: ");
        double valor = sc.nextDouble();

        double iss = calc.metodoIss(valor);
        double iof = calc.metodoIof(valor);
        double ir = calc.metodoIr(valor);

        System.out.printf("O valor dos impostos para o valor de = %.2f =  são: \n\n == Iss == %.2f \n == Iof == %.2f \n == IR == %.2f \n \n Goodbye!", valor, iss, iof, ir);
    }
}
