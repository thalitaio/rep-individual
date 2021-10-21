package atividade2110.model;

public class PessoaJuridica extends Base{
    public String cnpj;
    public Endereco enderecoComercial;

    @Override
    public String toString() {
        String retorno = "\nCNPJ: " + this.cnpj + "\nEndereço: " + this.enderecoComercial;
        return retorno;
    }

}
