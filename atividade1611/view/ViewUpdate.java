package view;
import java.util.Scanner;

import dao.CategoriaDao;
import model.Categoria;

public class ViewUpdate {
    public static void main(String[] args) {

        Categoria model = new Categoria();
        CategoriaDao dao = new CategoriaDao();
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\nDigite o ID a ser atualizado: ");
            model.setId(sc.nextInt());

            System.out.print("\nDigite o novo nome para a categoria: ");
            model.setNome(sc.nextLine());
            model.setNome(sc.nextLine());

            System.out.print("\nDigite uma nova descrição para a categoria: ");
            model.setDescricao(sc.nextLine());

        } catch (Exception e) {
            System.out.println("Não foi possível ler os dados inseridos.");
        }

        dao.update(model);

    }

   
}
