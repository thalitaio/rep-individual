package com.natal.natal.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import com.natal.natal.models.CategoriaModel;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria")
public class CategoriaServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CategoriaModel cat = new CategoriaModel();

        cat.setNome(req.getParameter("nome"));
        cat.setDescricao(req.getParameter("descricao"));

        PrintWriter out = resp.getWriter();
        out.printf("Modulo Categoria -- CategoriaModel = %s - %s", cat.getNome(), cat.getDescricao());
    }
}
