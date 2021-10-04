package atividade0410;

public class TelaPrincipalBanco {
    public static void main(String[] args) {
        ContaCorrente novo_cliente = new ContaCorrente();

        novo_cliente.setAgencia(6782);
        novo_cliente.setCodigoCliente(23444);
        novo_cliente.setNumero(133);
        novo_cliente.setSaldo(5.000);

        //Impressão dos dados
        System.out.println("=== Conta Corrente ===\n");
        System.out.print("Agência: ");
        System.out.println(novo_cliente.getAgencia());
        System.out.print("Código do cliente: ");
        System.out.println(novo_cliente.getCodigoCliente());
        System.out.print("Número: ");
        System.out.println(novo_cliente.getNumero());
        System.out.print("Saldo: R$ ");
        System.out.println(novo_cliente.getSaldo());
        System.out.println("\n=========================================");

    }

}
