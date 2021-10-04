/*

_ Utilize o repositório criado durante a realização da sua última atividade individual. OK
_ Execute o commit e push a cada etapa finalizada. OK
_ Crie uma classe Números com um método main. OK
_ Crie nesta classe um array de números inteiros com 10 posições.OK
_ Adicione um valor para cada posição do array. OK
_ Imprima ao final da execução do main, todas as posições do array utilizando o laço de repetição for.
_ Crie uma classe Pessoa Física com os atributos código, nome, sobrenome, idade, rg e cpf.
_ Todos os atributos da classe Pessoa Física devem ser privados.
_ Construa os métodos get e set para cada um dos atributos da classe.
_ Crie uma classe Cadastro de Pessoas que contenha um método main.
_ Nesta classe, crie um array de Pessoa com 5 posições.
_ Crie 5 objetos da classe pessoa, chame os método set para atribuir valores diferente para cada pessoa e salve cada objeto em uma posição do array.
_ Imprima todos os dados das 5 pessoas utilizando o laço de repetição foreach.


*/


package atividade0410;

public class Numeros {
    public static void main(String[] args) {
        
        int[] numeros_inteiros = new int[10];

        numeros_inteiros[0] = 0;
        numeros_inteiros[1] = 1;
        numeros_inteiros[2] = 2;
        numeros_inteiros[3] = 3;
        numeros_inteiros[4] = 4;
        numeros_inteiros[5] = 5;
        numeros_inteiros[6] = 6;
        numeros_inteiros[7] = 7;
        numeros_inteiros[8] = 8;
        numeros_inteiros[9] = 9;

        //Imprimindo os arrays
       // for (int i = 0; i < numeros_inteiros.length; i++) {
        //    System.out.println(numeros_inteiros[1]);
        //}

        for (int i : numeros_inteiros) {
            System.out.println(i);
        }
    }

}
