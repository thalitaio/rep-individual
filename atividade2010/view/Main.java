package atividade2010.view;

import atividade2010.controller.FilmesController;
import atividade2010.controller.SeriesController;
import atividade2010.model.Filmes;
import atividade2010.model.Series;

public class Main {
    public static void main(String[] args) {
        FilmesController filmesController = new FilmesController();
        SeriesController seriesController = new SeriesController();


        Series s = new Series();
        s.ano = 2000;
        s.genero = "Fantasia";
        s.id = 1;
        s.nome = "Lost";
        s.temporadas = 500;

        Filmes f = new Filmes();
        f.ano = 1990;
        f.duracaoTotal = "80 min";
        f.genero = "Comédia";
        f.id = 2;
        f.nome = "Elvira, a rainha das trevas";

        filmesController.create(f);
        for (Filmes filme : filmesController.read()) {
            System.out.println(filme);
        }
        
        
        Filmes f2 = new Filmes();
        f2.ano = 1990;
        f2.duracaoTotal = "80 min";
        f2.genero = "Comédia";
        f2.id = 2;
        f2.nome = "AAA";

        filmesController.update(f2);
        for (Filmes filme : filmesController.read()) {
            System.out.println(filme);
        }
        
        filmesController.delete(f);
        for (Filmes filme : filmesController.read()) {
            System.out.println(filme);
        }

        seriesController.create(s);
        for (Series serie : seriesController.read()) {
            System.out.println(serie);
        }


    }
}
