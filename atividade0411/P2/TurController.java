package P2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TurController implements IController {

    
    public String salvar(String dado) {
        FileWriter fw;
        try {
            fw = new FileWriter("P2/DadosTurismo.txt", true);
            fw.write(dado + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Not this time.");
        }
        return dado + " salvo com sucesso. \n";
    }

    public ArrayList<String> ler() {
        ArrayList<String> dados = new ArrayList<String>();
        try {
            Scanner sc = new Scanner(new File("P2/DadosTurismo.txt"));
            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                dados.add(linha);
            }
        } catch (FileNotFoundException e) {
            System.out.println("A leitura não pode ser realizada.");
        }
        
        return dados;
    }
    
}
