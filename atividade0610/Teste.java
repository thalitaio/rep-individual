package atividade0610;

public class Teste {
  public static void main(String[] args) {
    Conta c = new Conta();
    Conta cc = new ContaCorrente();

    //inserir os valores de saldo e de código de cliente para os dois objetos
    //conta
    c.setSaldo(1000);
    c.setCodigo_cliente("001");
    double transf_c = c.transferencia(500);

    //conta corrente
    cc.setSaldo(2000);
    cc.setCodigo_cliente("002");
    double transf_cc = cc.transferencia(50);

    //Imprima os dados de código de cliente, saldo e de saldo após a transferência,
    System.out.printf("Código cliente: %s -- Saldo: %.2f -- Saldo após transferência: %.2f \n", c.getCodigo_cliente(), c.getSaldo(), transf_c);
    System.out.printf("Código cliente: %s -- Saldo: %.2f -- Saldo após transferência: %.2f \n", cc.getCodigo_cliente(), cc.getSaldo(), transf_cc);

  }
}
