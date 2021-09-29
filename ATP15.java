/*
_ Crie uma nova classe para esta atividade e que possua um método main para executar a aplicação.
_ Construa uma classe Pessoa que possua as propriedades nome, sobrenome e idade.
_ Na classe principal, dentro do metodo main, construa dois objetos da classe pessoa e preencha com valores diferentes para cada objeto.
_ Ao final da execução do método main, imprima todos os dados das duas pessoas. 

*/


public class ATP15 {
    public static void main(String[] args) {
    
        //criando objeto pessoa1
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Ana";
        pessoa1.sobrenome = "Silva";
        pessoa1.idade = 20;

        //criando objeto pessoa2
        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Maria";
        pessoa2.sobrenome = "Rodrigues";
        pessoa2.idade = 45;

        System.out.println(pessoa1.nome);
        System.out.println(pessoa1.sobrenome);
        System.out.println(pessoa1.idade);
        System.out.println("============================");
        System.out.println(pessoa2.nome);
        System.out.println(pessoa2.sobrenome);
        System.out.println(pessoa2.idade);
    }
    
}
