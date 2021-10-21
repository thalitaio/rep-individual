package atividade2110.model;

public class PessoaFisica extends Base{
    public String cpf;
    public Endereco enderecoResidencial;

    @Override
    public String toString() {
        String retorno = "\nCPF: " + this.cpf + "\nEndereço: " + this.enderecoResidencial;
        return retorno;
    }
}
