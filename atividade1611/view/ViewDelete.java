package view;

import java.util.Scanner;

import dao.CategoriaDao;
import model.Categoria;

public class ViewDelete {
    public static void main(String[] args) {
        Categoria model = new Categoria();
        CategoriaDao dao = new CategoriaDao();
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\nDigite o id que deseja deletar: ");
            model.setId(sc.nextInt());

        } catch (Exception e) {
            System.out.println("Não foi possível deletar.");
        }

        dao.delete(model);
    }

}
