package atividade1910;
/*
_  Crie um objeto da classe Pessoa, um da classe Aluno e atribua valores para as propriedade de cada objeto.
_  Crie um objeto da classe Dados e chame o metodo para adicionar os objetos de Pessoa e Aluno ao array. NOT 
_  Crie um novo objeto para Pessoa e atribua os mesmos dados da pessoa criada anteriormente.
_  Utilize o método de dados para verificar se a novo objeto ja esta salvo no array.
_  Remova o aluno do array, utilizando o método da classe Dados.
*/
public class Main {
 public static void main(String[] args) {
    Pessoa p = new Pessoa();
    Aluno a = new Aluno();

    p.nome = "Pérola";
    p.sobrenome = "A Bonita";
    p.idade = 8;

    a.curso = "Belas Artes";
    a.idade = 9;
    a.matricula = "897BA";
    a.nome = "Perolinha";
    a.sobrenome = "A Melhor";
    a.turma = "B";

    Dados dados = new Dados();

   
    System.out.println(dados.add(p));
    Pessoa p2 = p;
    System.out.println(dados.verificar(p2));
    System.out.println(dados.remove(p2));

    dados.add(a);
    dados.imprime();
 }
    
}
