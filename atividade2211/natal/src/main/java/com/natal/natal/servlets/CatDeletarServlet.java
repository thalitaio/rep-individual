package com.natal.natal.servlets;

import java.io.IOException;

import com.natal.natal.dao.CategoriaDao;
import com.natal.natal.models.CategoriaModel;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoriamodel/deletar")
public class CatDeletarServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CategoriaDao dao = new CategoriaDao(); 
        CategoriaModel model = new CategoriaModel();
               
        int id = Integer.parseInt(req.getParameter("id"));
        model.setId(id);
        System.out.println("Rolou******************************************************");
        System.out.println(id);
        dao.delete(model);

        RequestDispatcher rd = req.getRequestDispatcher("/categoriamodel/listar");
        rd.forward(req, resp);
    }
}

