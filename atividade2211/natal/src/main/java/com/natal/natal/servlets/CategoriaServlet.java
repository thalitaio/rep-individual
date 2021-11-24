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

@WebServlet(urlPatterns = "/categoria")
public class CategoriaServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CategoriaDao dao = new CategoriaDao();
        CategoriaModel model = new CategoriaModel();

        model.setNome(req.getParameter("nome"));
        model.setDescricao(req.getParameter("descricao"));
        int id = dao.create(model);
        model.setId(id);

        req.setAttribute("id", model.getId());

       RequestDispatcher rd = req.getRequestDispatcher("categoria-criada.jsp");
       rd.forward(req, resp);
    }
}
