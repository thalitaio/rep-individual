package com.natal.natal.servlets;

import java.io.IOException;
import java.util.ArrayList;

import com.natal.natal.dao.CategoriaDao;
import com.natal.natal.models.CategoriaModel;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoriamodel/listar")
public class CatReadServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        CategoriaDao dao =  new CategoriaDao();
        ArrayList<CategoriaModel> categorias;
        String nome = req.getParameter("nome");
        String desc = req.getParameter("descricao");

        if(nome != null && nome != ""){
            categorias = dao.read(nome);
        }
        else{
            if(desc != null && desc != ""){
                categorias = dao.read(desc);
            }
            else{
                categorias = dao.read();
            }    
            
        } 
       
        req.setAttribute("categorias", categorias);
        RequestDispatcher rd = req.getRequestDispatcher("/categoria-lista.jsp");
        rd.forward(req, resp);
    }
}
