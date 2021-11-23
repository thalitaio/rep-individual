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

@WebServlet(urlPatterns = "/categoria")
public class CategoriaServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CategoriaDao dao = new CategoriaDao();
        CategoriaModel model = new CategoriaModel();

        model.setNome(req.getParameter("nome"));
        model.setDescricao(req.getParameter("descricao"));
        dao.create(model);

        PrintWriter out = resp.getWriter();
        out.printf("Modulo Categoria -- CategoriaModel = ID: %d - Nome: %s - Descricao: %s", model.getId(), model.getNome(), model.getDescricao());
    }
}
