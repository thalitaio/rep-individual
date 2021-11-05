package P2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TurController implements IController {
    private String filename = "P2/DadosTurismo.txt";
    
    @Override
    public String salvar(TurModel model) {
        FileWriter fw;
        String msg;
        try {
            fw = new FileWriter(filename, true);
            fw.write(model.toString() + "\n");
            fw.close();
            msg = String.format("%s saldo com sucesso \n", model.nome);
        } catch (IOException e) {
            msg = "Not this time.";
        }
        return msg;
    }

    @Override
    public ArrayList<TurModel> ler() {
        ArrayList<TurModel> dados = new ArrayList<TurModel>();
        try {
            Scanner sc = new Scanner(new File(filename));
            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                String[] dados2 = linha.split(";");
                TurModel pt = new TurModel();
                pt.nome = dados2[0];
                pt.descricao = dados2[1];
                pt.localizacao = dados2[2];
                dados.add(pt);
            }
        } catch (FileNotFoundException e) {
            System.out.println("A leitura não pode ser realizada.");
        }
        
        return dados;
    }
    
}
