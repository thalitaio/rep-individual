package atividade1810;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        Carro carro = new Carro();

        veiculo.marca = "Fiat";
        veiculo.modelo = "Toro";
        veiculo.placa = "ABC123";

        carro.numero_portas = 4;
        carro.porta_mala = 937.00;

        //Crie um objeto da classe Object através da instância da classe Veículo.
        Object obj1 = veiculo;

        //Crie um objeto da classe Object através da instância da classe Carro.
        Object obj2 = carro;

        //Converta o primeiro objeto da Object novamente para um novo objeto da classe Veículo.
        Veiculo veiculo_obj = (Veiculo)obj1;

        //Converta o segundo objeto da Object novamente para um novo objeto da classe Carro.
        Carro carro_obj = (Carro)obj2;

        //Imprima todos dos dados do objeto de Veículo convertido.
        System.out.println(veiculo_obj);

        //Imprima todos dos dados do objeto de Carro convertido.
        System.out.println(carro_obj);
    }
}
