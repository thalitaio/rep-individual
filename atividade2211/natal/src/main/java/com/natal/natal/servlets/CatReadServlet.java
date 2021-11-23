package com.natal.natal.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.natal.natal.dao.CategoriaDao;
import com.natal.natal.models.CategoriaModel;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoriamodel/listar")
public class CatReadServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        CategoriaDao dao = new CategoriaDao();
        for (CategoriaModel model : dao.read()) {
            out.printf("Id: %d - Nome: %s - Descricaoo: %s \n", model.getId(), model.getNome(), model.getDescricao());
        }
    }
}
