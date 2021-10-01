package atividade0110;

public class CalculoImpostoMain {
    public static void main(String[] args) {
        CalculoImposto calc = new CalculoImposto();

        double iss = calc.metodoIss();
        double iof = calc.metodoIof();
        double ir = calc.metodoIr();

        System.out.printf("O valor dos impostos são: \n == Iss == %.2f \n == Iof == %.2f \n == IR == %.2f \n Goodbye!", iss, iof, ir);
    }
}
