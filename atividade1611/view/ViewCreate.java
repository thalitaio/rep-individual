package view;
import java.util.Scanner;

import com.natal.natal.dao.CategoriaDao;

import model.Categoria;

public class ViewCreate {
    public static void main(String[] args) {
        Categoria model = new Categoria();
        CategoriaDao dao = new CategoriaDao();
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\nDigite o nome para a categoria: ");
            model.setNome(sc.nextLine());

            System.out.print("\nDigite uma descrição para a categoria: ");
            model.setDescricao(sc.nextLine());

        } catch (Exception e) {
            System.out.println("Não foi possível ler os dados inseridos.");
        }

        dao.create(model);
    
    }

    


}
