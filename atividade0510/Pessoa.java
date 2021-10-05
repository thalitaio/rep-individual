/*
_ Crie uma classe Pessoa com as propriedades nome, sobrenome e matrícula. OK
_ Crie uma classe Funcionário com as propriedades salário e departamento. OK
_ Crie uma classe Coordenador com as propriedades Curso Coordenado e bônus. OK
_ Crie uma classe Aluno com as propriedades curso e turma. OK
_ Altere a classe Funcionario para que ela herde da classe Pessoa. OK
_ Altere a classe Coordenador para que ela herde da classe Funcionário.OK
_ Altere a classe Aluno para que ela herde da classe Pessoa.OK
_ Os atributos de todas as classes devem ser privados. OK
_ Construa os métodos get e set para cada um dos atributos das classes.

_ Crie uma classe Universidade, adicione um método main, crie um objeto de Funcionario, um objeto de Coordenador e um objeto de Aluno.
_ Utilize os métodos set dos objetos de Funcionario, Coordenador e Aluno para inserir valores.
_ Imprima todos os dados dos objetos, utilizando seu metodos get, ao final da execução.

*/


package atividade0510;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String matricula;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getSobrenome() {
        return sobrenome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getMatricula() {
        return matricula;
    }
}
