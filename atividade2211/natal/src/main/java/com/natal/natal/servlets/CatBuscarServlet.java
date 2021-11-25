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

@WebServlet(urlPatterns = "/categoriamodel/carregar")
public class CatBuscarServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CategoriaDao dao = new CategoriaDao();
        int id = Integer.parseInt(req.getParameter("id"));
        CategoriaModel model = dao.readById(id);

        RequestDispatcher rd = req.getRequestDispatcher("/categoria-alterar.jsp");
        req.setAttribute("model", model);
        rd.forward(req, resp);
        
    }
}