package atividade1810_2;

public class Main {
    public static void main(String[] args) {
        //Crie um objeto da classe Computador, um da classe Notebook, um da classe Desktop e atribua valores para as propriedade de cada objeto.

        Computador computador = new Computador();
        Notebook notebook = new Notebook();
        Desktop desktop = new Desktop();

        computador.disco_rigido = 100;
        computador.marca = "Mac";
        computador.memoria_ram = 400;
        computador.processador = 200;

        notebook.bateria = "900W";
        notebook.bluetooth = true;
        notebook.disco_rigido = 500;
        notebook.marca = "Dell";
        notebook.memoria_ram = 300;
        notebook.processador = 750;
        notebook.processador = 900;
        notebook.velocidade = 400;
        notebook.wifi = true;

        desktop.disco_rigido = 400;
        desktop.fonte = 750;
        desktop.marca = "Acer";
        desktop.memoria_ram = 200;
        desktop.monitor_externo = 25;
        desktop.processador = 600;
        desktop.tamanho_gabinete = " 30 x 50 cm";

        
        Object obj_computador = computador;
        Object obj_notebook = notebook;
        Object obj_desktop = desktop;

        Computador obj_computador2 = (Computador)obj_computador;
        Notebook obj_notebook2 = (Notebook)obj_notebook;
        Desktop obj_desktop2 = (Desktop)obj_desktop;

        System.out.println(obj_computador2);
        System.out.println(obj_notebook2);
        System.out.println(obj_desktop2);
    }
}
