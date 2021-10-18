package atividade1810_2;

public class Notebook extends Computador{
    //Crie uma classe notebook que herda de computador com os atributos públicos: bateria, velocidade wifi e versão bluetooth.
    public String bateria;
    public int velocidade;
    public boolean wifi;
    public boolean bluetooth;

    @Override
    public String toString() {
        return "\nBateria: " + this.bateria + "\n" + "Velocidade: " + this.velocidade + "\n" + "Wifi: " + this.wifi + "\n" + "Bluetooth: " + this.bluetooth; 
    }
}
