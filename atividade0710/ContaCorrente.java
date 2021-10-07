/*
_ Crie uma classe Conta Corrente com os atributos privados: saldo, taxa saque e codigo de cliente. OK
_ Crie um método Construtor na classe Conta Corrente que receba o valor do saldo e do código do cliente OK
_ Crie um método saque que recebe um valor double e que debita do saldo o valor mais a taxa de saque. OK
_ Crie um método depósito que recebe um valor double e soma ao valor do saldo.OK
_ Adicione um valor fixo ao atributo taxa saque OK
_ Crie uma classe Tela Banco que contenha um método main.
_ Crie um objeto da classe Conta Corrente, insira as informações no construtor, realize um saque, um depósito e imprima saldo, taxa saque e codigo de cliente usando toString;
_ Crie uma classe Calculadora.
_ Adicione a classe Calculadora um método soma que recebe dois parâmetros e inteiros e retorna um inteiro com o resultado.
_ Adicione a classe Calculadora um método soma que recebe dois parâmetros double e retorna um double com o resultado.
_ Adicione a classe Calculadora um método soma que recebe três parâmetros float e retorna um float com o resultado.
_ Adicione a classe Calculadora um método soma que recebe três parâmetros long e retorna um long com o resultado.
_ Crie uma classe Tela com um método main, crie um objeto da classe Calculadora, chame cada método criado e imprima seus resultados.
*/

package atividade0710;

public class ContaCorrente {
    private double saldo;
    private double taxa_saque = 0.65;
    private String codigo_cliente;

    public ContaCorrente(double saldo, String codigo_cliente) {
        this.saldo = saldo;
        this.codigo_cliente = codigo_cliente;
    }

    //Crie um método saque que recebe um valor double e que debita do saldo o valor mais a taxa de saque.
    public double saque(double valor) {
        saldo -= valor + taxa_saque;
        return saldo;
    }

    //Crie um método depósito que recebe um valor double e soma ao valor do saldo.
    public double
    deposito(double valor) {
        saldo += valor;
        return saldo;
    }

    public String toString(){
        String mensagem = "\nSaldo: " + this.saldo + "\nTaxa Saque: " + this.taxa_saque + "\nCódigo do cliente: " + codigo_cliente ;
        return mensagem;
    }

}
