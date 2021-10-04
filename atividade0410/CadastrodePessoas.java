package atividade0410;

public class CadastrodePessoas {
    public static void main(String[] args) {
        PessoaFisica[] pessoas = new PessoaFisica[5];

        //nome, sobrenome, idade, rg e cpf.
        PessoaFisica p1 = new PessoaFisica();
        p1.setNome("Maria");
        p1.setSobrenome("Silva");
        p1.setIdade(20);
        p1.setRg("23456789");
        p1.setCpf("1234567890");

        PessoaFisica p2 = new PessoaFisica();
        p2.setNome("Ana");
        p2.setSobrenome("Banana");
        p2.setIdade(28);
        p2.setRg("23455589");
        p2.setCpf("1233367896");

        PessoaFisica p3 = new PessoaFisica();
        p3.setNome("Paola");
        p3.setSobrenome("Bracho");
        p3.setIdade(40);
        p3.setRg("23457779");
        p3.setCpf("12377777890");

        PessoaFisica p4 = new PessoaFisica();
        p4.setNome("Carla");
        p4.setSobrenome("Perez");
        p4.setIdade(40);
        p4.setRg("23451119");
        p4.setCpf("1211167898");

        PessoaFisica p5 = new PessoaFisica();
        p5.setNome("Sheila");
        p5.setSobrenome("Carvalho");
        p5.setIdade(60);
        p5.setRg("23456788");
        p5.setCpf("1234567844");

        pessoas[0] = p1;
        pessoas[1] = p2;
        pessoas[2] = p3;
        pessoas[3] = p4;
        pessoas[4] = p5;

        for (PessoaFisica i : pessoas) {
            System.out.printf("%s  %s - Idade: %d - RG: %s - CPF: %s \n", i.getNome(), i.getSobrenome(), i.getIdade(), i.getRg(), i.getCpf());
            System.out.println("-------------------------------------");
        }

    }
}
