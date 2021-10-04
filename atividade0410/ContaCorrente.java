package atividade0410;

public class ContaCorrente {
    private int agencia;
    private int numero;
    private int codigo_cliente;
    private double saldo;

    public void setAgencia(int agencia){
        this.agencia = agencia;
    }
    public int getAgencia(){
        return this.agencia;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return this.numero;
    }

    public void setCodigoCliente(int codigo_cliente){
        this.codigo_cliente = codigo_cliente;
    }
    public int getCodigoCliente(){
        return this.codigo_cliente;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return this.saldo;
    }

}
