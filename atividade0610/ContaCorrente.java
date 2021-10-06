package atividade0610;

//atributos privados: taxa transferência, taxa manutenção e número de transferências. 
//Defina um valor padrão para taxa de transferência de R$10.50, um valor de R$2.50 para taxa de manutenção e 0 para o número de transferências;
public class ContaCorrente extends Conta {
    private double taxa_transferencia = 10.50;
    private double taxa_manutencao = 2.50;
    private double numero_transferencia = 0;

    /*
    _ Altere a classe Conta Corrente construindo um método para sobrescrever o método de transfêrencia, da classe Conta.ok
    _ O novo método deve utilizar as funções do método principal, além de debitar a taxa de transferência do saldo da conta.
    _ O método de transferência da Conta Corrente também deve armazenar, no atributo número de transferencias, a quantidade de transferências realizadas e a cada 5 transferências deve debitar do saldo, o valor da taxa de manutenção de conta.
    */

    @Override
    public void transferencia(double valor) {
        super.transferencia(valor);
        double novo_saldo = this.getSaldo() - taxa_transferencia;
        this.setSaldo(novo_saldo);
        
        
        if (numero_transferencia % 5 == 0){
            novo_saldo = this.getSaldo() - taxa_manutencao;
            this.setSaldo(novo_saldo);
        }

        this.numero_transferencia ++;
    }
}
