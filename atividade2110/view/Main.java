package atividade2110.view;
import atividade2110.controller.PessoaFisicaController;
import atividade2110.controller.PessoaJuridicaController;
import atividade2110.model.Endereco;
import atividade2110.model.PessoaFisica;
import atividade2110.model.PessoaJuridica;

public class Main {
    public static void main(String[] args) {
        PessoaJuridica pj = new PessoaJuridica();
        PessoaFisica pf = new PessoaFisica();
        PessoaJuridicaController pessoaJuridicaController = new PessoaJuridicaController();
        PessoaFisicaController pessoaFisicaController = new PessoaFisicaController();

        pj.cnpj = "23456789567";
        Endereco enderecoComercial1 = new Endereco();
        enderecoComercial1.cep = "456789-999";
        enderecoComercial1.cidade = "São Paulo";
        enderecoComercial1.complemento = "Bloco 4 - 202";
        enderecoComercial1.estado = "SP";
        enderecoComercial1.id = 1;
        enderecoComercial1.numero = 9998;
        enderecoComercial1.pais = "Brasil";
        enderecoComercial1.rua = "Av. Paulista";
        pj.enderecoComercial = enderecoComercial1;

        pf.cpf = "234567-88";
        Endereco enderecoResidencial1 = new Endereco();
        enderecoResidencial1.cep = "345678-999";
        enderecoResidencial1.cidade = "RJ";
        enderecoResidencial1.complemento = "Casa 3";
        enderecoResidencial1.estado = "RJ";
        enderecoResidencial1.id = 2;
        enderecoResidencial1.numero = 35;
        enderecoResidencial1.pais = "BR";
        enderecoResidencial1.rua = "Rua dos ladrilhos";
        pf.enderecoResidencial = enderecoComercial1;

        pessoaFisicaController.create(pf);
        for (PessoaFisica pessoas : pessoaFisicaController.read()) {
            System.out.println(pessoas);
        }

        PessoaFisica pf2 = new PessoaFisica();
        pf2.cpf = "00000-0000";
        Endereco enderecoResidencial2 = new Endereco();
        enderecoResidencial2.cep = "AAA";
        enderecoResidencial2.cidade = "RJ";
        enderecoResidencial2.complemento = "Casa 3";
        enderecoResidencial2.estado = "WW";
        enderecoResidencial2.id = 2;
        enderecoResidencial2.numero = 35;
        enderecoResidencial2.pais = "BR";
        enderecoResidencial2.rua = "AAA";
        pf2.enderecoResidencial = enderecoResidencial2;
        pessoaFisicaController.updade(pf2);
        for (PessoaFisica pessoas : pessoaFisicaController.read()) {
            System.out.println(pessoas);
        }

        pessoaJuridicaController.create(pj);
        for (PessoaJuridica pessoas : pessoaJuridicaController.read()) {
            System.out.println(pessoas);
        }

        pessoaFisicaController.delete(pf2);
        
    }
}
