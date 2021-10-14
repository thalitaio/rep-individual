package atividade1410.model;
/*
_  Crie um sistema de cadastro de livros.
_  O sistema deve utilizar o padrão de arquitetura MVC OK
_  O modelo deve possuir um id e outros atributos de sua escolha. OK
_  A controller deve possuir os quatro métodos de CRUD e deve utilizar um ArrayList privado para manter os dados.
_  A view deve possuir um menu para usuário poder escolher quais das operações de CRUD utilizar.

*/
public class Livros {
    public String titulo;
    public String assunto;
    public int id;

    @Override
    public boolean equals(Object obj) {
        Livros livro =  (Livros)obj;
        if(this.id == livro.id){
            return true;
        }else{
            return false;
        }
    }
}
