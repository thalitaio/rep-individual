package atividade0610;

public class Teste {
  public static void main(String[] args) {
    Conta c = new Conta();
    Conta cc = new ContaCorrente();

    //inserir os valores de saldo e de código de cliente para os dois objetos
    //conta
    c.setSaldo(1000);
    c.setCodigo_cliente("001");
    double saldo_inicial_c = c.getSaldo();
    c.transferencia(500);

    //conta corrente
    cc.setSaldo(2000);
    cc.setCodigo_cliente("001");
    double saldo_inicial_cc = cc.getSaldo();
    cc.transferencia(50);
    cc.transferencia(50);
    cc.transferencia(50);
    cc.transferencia(50);
    cc.transferencia(50);
    cc.transferencia(50);

    //Imprima os dados de código de cliente, saldo e de saldo após a transferência,
    System.out.println("------------ Conta ----------- \n\n");
    System.out.printf("Código cliente: %s -- Saldo: %.2f -- Saldo após transferência: %.2f \n\n", c.getCodigo_cliente(), saldo_inicial_c, c.getSaldo());
    System.out.println("------------ Conta Corrente ----------- \n\n");
    System.out.printf("Código cliente: %s -- Saldo: %.2f -- Saldo após transferência: %.2f \n\n", cc.getCodigo_cliente(), saldo_inicial_cc ,cc.getSaldo());

  }
}
