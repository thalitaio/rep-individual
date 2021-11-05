package P2;
/*
_  Crie um sistema para cadastro de Pontos Turísticos. A classe de modelo deve possuir três atributos públicos: nome, descrição e localização. OK
_  Crie uma interface que contenha os métodos de leitura e gravação de dados para pontos turísticos.
_  Crie duas implementações da interface. Uma que usará um lista para armazenar os dados e outra que utilizará um arquivo texto como fonte de dados.
_  Crie duas classes View para testar cada uma das implementações criadas.

*/
public class TurModel {
    public String nome;
    public String descricao;
    public String localizacao;

    @Override
    public String toString() {
        return String.format("%s ; %s ; %s", nome, descricao, localizacao);
    }
}
