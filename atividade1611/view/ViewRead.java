package view;

import dao.CategoriaDao;
import model.Categoria;

public class ViewRead {
    public static void main(String[] args) {
        CategoriaDao dao = new CategoriaDao();
        for (Categoria c : dao.read()) {
            System.out.printf("ID: %d - Nome: %s - Descrição: %s \n", c.getID(), c.getNome(), c.getDescricao());
        }
    }
}
