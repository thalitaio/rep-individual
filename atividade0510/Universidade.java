package atividade0510;


//Crie uma classe Universidade, adicione um método main, crie um objeto de Funcionario, um objeto de Coordenador e um objeto de Aluno.

public class Universidade {
    public static void main(String[] args) {
        Funcionarios func = new Funcionarios();
        Coordenador coord = new Coordenador();
        Aluno alun = new Aluno();

        //Utilize os métodos set dos objetos de Funcionario, Coordenador e Aluno para inserir valores.

        func.setDepartamento("Economia");
        func.setSalario(5000);
        func.setMatricula("345678");
        func.setNome("Maria");
        func.setSobrenome("Souza");
        
        //Imprimindo Funcionários
        System.out.println("========== Funcionários ==========\n");
        System.out.printf("Departamento: %s || Salário: %.2f || Matrícula: %s || Nome Completo: %s %s \n\n", func.getDepartamento(), func.getSalario(), func.getMatricula(), func.getNome(), func.getSobrenome());

        //Inserindo valorios no objeto Coordenador
        coord.setDepartamento("Coordenação Pedagógica");
        coord.setMatricula("234567");
        coord.setNome("Rita");
        coord.setSobrenome("Amaral");
        coord.setSalario(10000);
        double bonus = coord.getSalario() * 1.1;
        coord.setBonus(bonus);
        coord.setCurso_coordenado("Ciência da Computação");

        //Imprimindo Coordenador
        System.out.println("========== Coordenação ==========\n");
        System.out.printf("Departamento: %s || Salário: %.2f || Matrícula: %s || Nome Completo: %s %s || Curso Coordenado: %s || Bônus: %.2f \n\n", coord.getDepartamento(), coord.getSalario(), coord.getMatricula(), coord.getNome(), coord.getSobrenome(), coord.getCurso_coordenado(), coord.getBonus());

        // Inserindo valores para aluno
        alun.setCurso("Tecnologia da Informação");
        alun.setMatricula("345678");
        alun.setNome("Joana");
        alun.setSobrenome("Gil");
        alun.setTurma("D");

        //Imprimindo Aluno
        System.out.println("========== Aluno ==========\n");
        System.out.printf("Curso: %s || Matrícula: %s || Nome Completo: %s %s || Turma: %s \n\n", alun.getCurso(), alun.getMatricula(), alun.getNome(), alun.getSobrenome(), alun.getTurma());

        System.out.println("\n\n========== FIM ==========\n");


    }
}
