/*
_ Crie uma classe Tela Banco que contenha um método main.OK
_ Crie um objeto da classe Conta Corrente, insira as informações no construtor, realize um saque, um depósito e imprima saldo**, taxa saque e codigo de cliente usando toString; OK
_ Crie uma classe Calculadora.OK
_ Adicione a classe Calculadora um método soma que recebe dois parâmetros e inteiros e retorna um inteiro com o resultado.
_ Adicione a classe Calculadora um método soma que recebe dois parâmetros double e retorna um double com o resultado.
_ Adicione a classe Calculadora um método soma que recebe três parâmetros float e retorna um float com o resultado.
_ Adicione a classe Calculadora um método soma que recebe três parâmetros long e retorna um long com o resultado.
_ Crie uma classe Tela com um método main, crie um objeto da classe Calculadora, chame cada método criado e imprima seus resultados.
*/


package atividade0710;

public class TelaBanco {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1000, "055");

        double saque = cc.saque(200);
        double deposito = cc.deposito(100);

        System.out.println("-------- Extrato ----------");
        System.out.println(cc);
        
    }
}
