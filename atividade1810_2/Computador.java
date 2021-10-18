package atividade1810_2;
/*
_  Crie uma classe computador com atributos públicos: marca, memoria ram, processador e disco rigido.OK
_  Crie uma classe notebook que herda de computador com os atributos públicos: bateria, velocidade wifi e versão bluetooth.OK
_  Crie uma classe desktop que herda de computador com os atributos públicos: tamanho gabinete, monitor externo e fonte.OK
_  Crie uma sobrescrita do método toString nas três classes para imprimir todos os dados.OK
_  Crie uma classe Main com um método main.OK
_  Crie um objeto da classe Computador, um da classe Notebook, um da classe Desktop e atribua valores para as propriedade de cada objeto.OK
_  Crie um objeto da classe Object através da instância da classe Computador.OK
_  Crie um objeto da classe Object através da instância da classe Notebook.OK
_  Crie um objeto da classe Object através da instância da classe Desktop.OK
_  Converta o primeiro objeto da Object novamente para um novo objeto da classe Computador.
_  Converta o segundo objeto da Object novamente para um novo objeto da classe Notebook.
_  Converta o terceiro objeto da Object novamente para um novo objeto da classe Desktop.
_  Imprima todos dos dados do objeto de Computador convertido através do toString.
_  Imprima todos dos dados do objeto de Notebook convertido através do toString.
_  Imprima todos dos dados do objeto de Desktop convertido através do toString.

*/
public class Computador {
    public String marca;
    public int memoria_ram;
    public int processador;
    public int disco_rigido;

    @Override
    public String toString() {
        return "\nMarca: " + this.marca + "\n" + "Memória Ram: " + this.memoria_ram + "\n" + "Processador: " + this.processador + "\n" + "Disco rígido: " + this.disco_rigido; 
    }
}
