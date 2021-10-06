package atividade0610;

/**
_ Crie uma classe Conta que deve possuir os atributos privados: saldo e código do cliente. OK
_ Crie os métodos set e get para os atributos privados da classe Conta. OK
_ Crie uma classe Conta Corrente com os atributos privados: taxa transferência, taxa manutenção e número de transferências. OK
_ Defina um valor padrão para taxa de transferência de R$10.50, um valor de R$2.50 para taxa de manutenção e 0 para o número de transferências OK
_ A classe Conta Corrente deve herdar da classe Conta.OK 
_ Crie um método transferência na classe Conta. O método deve receber um valor double e debitar do saldo da conta.
_ Crie uma classe Teste, adicione um método main, crie um objeto de Conta e um objeto de Conta Corrente.
_ Utilize os métodos set para inserir os valores de saldo e de código de cliente para os dois objetos.
_ Realize uma transferência em cada uma das contas.
_ Imprima os dados de código de cliente, saldo e de saldo após a transferência, para cada objeto
_ Altere a classe Conta Corrente construindo um método para sobrescrever o método de transfêrencia, da classe Conta.
_ O novo método deve utilizar as funções do método principal, além de debitar a taxa de transferência do saldo da conta.
_ O método de transferência da Conta Corrente também deve armazenar, no atributo número de transferencias, a quantidade de transferências realizadas e a cada 5 transferências deve debitar do saldo, o valor da taxa de manutenção de conta.
_ Altere a classe Teste, para realizar mais de 5 transferências na Conta Corrente, antes de imprimir os resultados.

 */

public class Conta {
    private double saldo;
    private String codigo_cliente;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setCodigo_cliente(String codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }
    public String getCodigo_cliente() {
        return codigo_cliente;
    }
}