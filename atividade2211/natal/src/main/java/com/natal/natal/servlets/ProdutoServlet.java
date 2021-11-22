package com.natal.natal.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import com.natal.natal.models.ProdutoModel;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/produto")
public class ProdutoServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        ProdutoModel prod = new ProdutoModel();

        String nome = req.getParameter("nome");
        String parametroValor = req.getParameter("valor");
        String parametroIdCategoria = req.getParameter("id_categoria");

        prod.setNome(nome);

        if(parametroValor != null && parametroIdCategoria !=null){
            prod.setValor(Float.parseFloat(parametroValor));
            prod.setIdCategoria(Integer.parseInt(parametroIdCategoria));
            out.printf("Modulo Produtos - ProdModel = %s - %.2f - %d", prod.getNome(), prod.getValor(), prod.getIdCategoria());
        } else{
            out.printf("Modulo Produtos - ProdModel = %s", prod.getNome());
        }
    }
}
