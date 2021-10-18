package atividade1810_2;

public class Desktop extends Computador{
    //Crie uma classe desktop que herda de computador com os atributos públicos: tamanho gabinete, monitor externo e fonte.
    public String tamanho_gabinete;
    public int monitor_externo;
    public int fonte;

    @Override
    public String toString() {
        return "\nTamanho de gabinete: " + this.tamanho_gabinete + "\n" + "Monitor externo: " + this.monitor_externo + "\n" + "Fonte: " + this.fonte;
    }
}
