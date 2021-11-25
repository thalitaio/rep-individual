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

@WebServlet(urlPatterns = "/categoriamodel/alterar")
public class CatAlterarServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String nome = req.getParameter("nome");
        String desc = req.getParameter("descricao");

        CategoriaModel model = new CategoriaModel();
        model.setId(id);
        model.setNome(nome);
        model.setDescricao(desc);

        CategoriaDao dao = new CategoriaDao();
        dao.update(model);

        RequestDispatcher rd = req.getRequestDispatcher("/categoria-alterado-sucesso.jsp");
        req.setAttribute("id", model.getId());

        rd.forward(req, resp);

    }
}
