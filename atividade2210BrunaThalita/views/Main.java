package atividade2210BrunaThalita.views;
import java.util.Scanner;
import atividade2210BrunaThalita.controllers.CategoriasController;
import atividade2210BrunaThalita.controllers.ProdutosController;
import atividade2210BrunaThalita.models.Categorias;
import atividade2210BrunaThalita.models.Produtos;


public class Main{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProdutosController prod = new ProdutosController();
        CategoriasController cat = new CategoriasController();


        int opcao;
        do {
            opcao = menu(sc);
            switch (opcao) {
                case 1:
                    cadastrar(prod, sc);
                    break;
                case 2:
                    listar(prod);
                    break;
                case 3:
                    alterar(prod, sc);
                    break;
                case 4:
                    deletar(prod, sc);
                    break;
                case 0:
                    System.out.println("Até breve!");
                    break;
            
                default:
                    break;
            }
        } while (opcao != 0);
    }

    private static int menu(Scanner sc) {
        System.out.print("\n\t1-Cadastrar\n\t2-Listar\n\t3-Alterar\n\t4-Deletar\n\t0-Sair\n\n\tEscolha uma opção:");
        int opcao = Integer.parseInt(sc.nextLine());
        return opcao;
    }

    private static void cadastrar(ProdutosController prod, Scanner sc){
        Produtos prod1 = new Produtos();
        System.out.print("Digite o eletrodoméstico: ");
        prod1.eletrodomestico = sc.nextLine();
        Categorias cat1 = new Categorias();
        System.out.print("Digite o id: ");
        prod1.id = Integer.parseInt(sc.nextLine());
        System.out.print("Digite o tipo: ");
        cat1.tipo = sc.nextLine();
        System.out.print("Digite a voltagem: ");
        cat1.voltagem = sc.nextLine();
        System.out.print("Digite o preço: ");
        cat1.preco = Double.parseDouble(sc.nextLine());
        prod1.catProduto = cat1;
        prod.create(prod1);
    }

    private static void listar(ProdutosController prod) {
        for (Produtos produto : prod.read()) {
                   System.out.printf("\nProduto Cadastrado %s", produto);
            }

    }

    private static void alterar(ProdutosController prod, Scanner sc) {
        Produtos prod1 = new Produtos();
        Categorias cat1 = new Categorias();
        System.out.print("Digite o id do produto a ser alterado: ");
        prod1.id = Integer.parseInt(sc.nextLine());
        System.out.print("Digite o eletrodoméstico: ");
        prod1.eletrodomestico = sc.nextLine();
        System.out.print("Digite o tipo: ");
        cat1.tipo = sc.nextLine();
        System.out.print("Digite a voltagem: ");
        cat1.voltagem = sc.nextLine();
        System.out.print("Digite o preço: ");
        cat1.preco = Double.parseDouble(sc.nextLine());
        prod1.catProduto = cat1;
        prod.update(prod1);
    }

    private static void deletar(ProdutosController prod, Scanner sc) {
        Produtos prod1 = new Produtos();
        Categorias cat1 = new Categorias();
        System.out.print("Digite o ID do produto a ser deletado: ");
        prod1.id = Integer.parseInt(sc.nextLine());
        prod.delete(prod1);
        for (Produtos produto : prod.read()) {
        System.out.printf("\nProduto Deletado.");
        }
    }
}