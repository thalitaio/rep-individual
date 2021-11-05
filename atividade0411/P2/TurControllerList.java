package P2;

import java.util.ArrayList;

public class TurControllerList implements IController {
    private ArrayList<String> dados;

    public TurControllerList(){
        this.dados = new ArrayList<String>();
    }
   
    public String salvar(String dado) {
        this.dados.add(dado);
        return dado + " salvo com sucesso.\n";
    }

    
    public ArrayList<String> ler() {
        return this.dados;
    }
    
}
