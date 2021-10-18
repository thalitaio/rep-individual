package atividade1810;
/*
_  Crie uma classe veiculo com atributos públicos: marca, modelo e placa.OK
_  Crie uma classe carro com os atributos públicos: número de portas e capacidade do porta-malas.OK
_  Crie uma classe Main com um método main.OK
_  Crie um objeto de classe Veículo e uma de classe Carro e atribua valores para as propriedade de cada objeto.OK
_  Crie um objeto da classe Object através da instância da classe Veículo.
_  Crie um objeto da classe Object através da instância da classe Carro.
_  Converta o primeiro objeto da Object novamente para um novo objeto da classe Veículo.
_  Converta o segundo objeto da Object novamente para um novo objeto da classe Carro.
_  Imprima todos dos dados do objeto de Veículo convertido.
_  Imprima todos dos dados do objeto de Carro convertido.

*/
public class Veiculo {
    public String marca;
    public String modelo;
    public String placa;

    @Override
    public String toString() {
        return this.marca + "\n" + this.modelo + "\n" + this.placa;
    }
}
