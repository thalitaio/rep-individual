package atividade0410;

public class TelaPrincipalLoja {
    public static void main(String[] args) {
        Produto estoque1 = new Produto();

        estoque1.setCodigo(001);

        estoque1.setDescricao("Regata de malha preta ovesize.");

        estoque1.setNome("Regata Celebridade");

        estoque1.setValor(69.00);

        //Impressão dos dados
        System.out.println("=== Produtos Cadastrados === \n");
        System.out.print("Código: ");
        System.out.println(estoque1.getCodigo());
        System.out.print("Descrição: ");
        System.out.println(estoque1.getDescricao());
        System.out.print("Nome do Produto: ");
        System.out.println(estoque1.getNome());
        System.out.print("Valor: ");
        System.out.println(estoque1.getValor());

    }
}
