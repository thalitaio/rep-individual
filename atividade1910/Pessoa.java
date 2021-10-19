package atividade1910;
/*
_  Crie uma classe Pessoa com os atributos públicos: nome, sobrenome e idade OK
_  Crie uma classe Aluno que herda de pessoa e que possua os atributos públicos: matricula, turma e curso OK
_  Crie uma sobrescrita do método equals nas duas classes para comparar os dados especificos de cada uma. OK
_  Crie uma sobrescrita do método toString nas duas classes para imprimir todos os dados OK
_  Crie uma classe Dados com um atributo privado do tipo array de Object.
_  Crie uma inicialização do array para 5 posições dentro do do método construtor da classe. //??
_  Crie um método para adicionar elementos ao array e que permita receber tanto objetos da classe pessoa quanto objetos da classe Aluno. Caso o array já tenha todas as posições ocupadas, deve ser adicionado mais 5 posições ao array. OK
_  Crie um método para mostrar quantos elementos já foram adicionados ao array. NOT OK
_  Crie um método para remover um elemento do array. //??
_  Crie um método para verificar se um determinado objeto já foi salvo no array. //??
_  Crie uma classe Main com um método main.
_  Crie um objeto da classe Pessoa, um da classe Aluno e atribua valores para as propriedade de cada objeto.
_  Crie um objeto da classe Dados e chame o metodo para adicionar os objetos de Pessoa e Aluno ao array.
_  Crie um novo objeto para Pessoa e atribua os mesmos dados da pessoa criada anteriormente.
_  Utilize o método de dados para verificar se a novo objeto ja esta salvo no array.
_  Remova o aluno do array, utilizando o método da classe Dados.
*/
public class Pessoa {
    public String nome;
    public String sobrenome;
    public int idade; //O java nao permitiu fazer override equals c int

    @Override
    public boolean equals(Object obj) {
        Pessoa p1 = (Pessoa)obj;
        if(this.nome.equals(p1.nome) && this.sobrenome.equals(p1.sobrenome) && this.idade == p1.idade){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String mensagem = "\nNome: " + this.nome + "\nSobrenome: " + this. sobrenome + "\nIdade: " + this.idade;
        return mensagem;
    }
}
