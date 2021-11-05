package P2;

import java.util.ArrayList;

public class TurControllerList implements IController {
    private ArrayList<TurModel> dados = new ArrayList<TurModel>();

   @Override
    public String salvar(TurModel model) {
        this.dados.add(model);
        return String.format("%s salvo com sucesso.", model.nome);
    }

    @Override
    public ArrayList<TurModel> ler() {
        return this.dados;
    }
    
}
