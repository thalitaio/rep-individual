package atividade0710;

public class Tela {
    public static void main(String[] args) {
        Aluno ingles = new Aluno();
        Aluno espanhol = new Aluno();

        ingles.setNome_completo("Ana");
        ingles.setMatricula("12345");
        ingles.setIdade(20);

        espanhol.setNome_completo("Maria");
        espanhol.setMatricula("77345");
        espanhol.setIdade(35);

        System.out.println(ingles);
        System.out.println(espanhol);

    }
}
