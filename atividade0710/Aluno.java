/*
_  Crie uma classe Aluno com os atributos privados nome completo, idade e matricula. OK
_  Crie os métodos getters e setters para cada atributo da classe Aluno. OK
_  Crie o métodos toString na classe Aluno, fazendo um override no método padrão da classe Object. OK
_  Crie uma classe Tela com um método main. OK
_  Crie na classe Tela, 2 objetos da classe Aluno, chame os métodos setters para inserir valores e imprima os objetos utilizando o método toString. OK -- commited--
_ Crie uma classe Conta Corrente com os atributos privados: saldo, taxa saque e codigo de cliente.
_ Crie um método Construtor na classe Conta Corrente que receba o valor do saldo e do código do cliente;
_ Crie um método saque que recebe um valor double e que debita do saldo o valor mais a taxa de saque.
_ Crie um método depósito que recebe um valor double e soma ao valor do saldo.
_ Adicione um valor fixo ao atributo taxa saque;
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

public class Aluno {
    private String nome_completo;
    private int idade;
    private String matricula;

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }
    public String getNome_completo() {
        return nome_completo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        
        String mensagem = "Nome: " + this.nome_completo + "\n" + "Idade: " + this.idade + "\n" + "Matrícula: " + this.matricula + "\n";
        return mensagem;
    }
}
