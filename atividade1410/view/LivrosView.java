package atividade1410.view;
//_A view deve possuir um menu para usuário poder escolher quais das operações de CRUD utilizar.

import java.util.ArrayList;
import java.util.Scanner;

import atividade1410.controller.LivrosController;
import atividade1410.model.Livros;

public class LivrosView {
    private static int id = 0;
    public static void main(String[] args) {
        LivrosController controller = new LivrosController();//?
        Scanner sc = new Scanner(System.in);

        int op;
        do{
            op = menu(sc);
            switch (op) {
                case 1:
                    create(controller, sc);
                    break;
                case 2:
                    listar(controller);
                    break;
                case 3:
                    update(controller, sc);
                    break;
                case 4:
                    delete(controller, sc);
                    break;
                case 5:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }while(op != 5);
        
    }

    private static int menu(Scanner sc) {
        System.out.print("Escolha qual operação deseja utilizar:\n 1 - Cadastrar \n 2 - Listar \n 3 - Atualizar \n 4 - Deletar \n 5 - Sair ");
        int op = Integer.parseInt(sc.nextLine());
        return op;
    }

    private static void listar(LivrosController controller) {
        ArrayList<Livros> listar = controller.listar();
        for (Livros books : listar){
            System.out.printf("Título: %s \n Assunto: %s \n ID: %d", books.titulo, books.assunto, books.id);
        }
    }

    private static void create(LivrosController controller, Scanner sc) {
        Livros l1 = new Livros();
        System.out.println("Digite o título do livro: ");
        l1.titulo = sc.nextLine();
        System.out.println("Digite o assunto do livro:");
        l1.assunto = sc.nextLine();
        l1.id = id++;
        controller.create(l1);
    }

    private static void delete(LivrosController controller, Scanner sc) {
        System.out.println("digite o id: ");
        int id = Integer.parseInt(sc.nextLine());
        Livros livro = new Livros();
        livro.id = id;
        controller.delete(livro);
    }

    private static void update(LivrosController controller, Scanner sc) {
        Livros l1 = new Livros();
        System.out.println("Digite o ID do livro para altera-lo: ");
        l1.id = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o título do livro: ");
        l1.titulo = sc.nextLine();
        System.out.println("Digite o assunto do livro:");
        l1.assunto = sc.nextLine();
        controller.update(l1);
    }

}
