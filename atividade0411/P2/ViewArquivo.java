package P2;

public class ViewArquivo {
    public static void main(String[] args) {
        
        TurModel tur = new TurModel();
        tur.nome = "Cristo Rei";
        tur.localizacao = "Almada";
        tur.descricao = "Cristo redentor de Portugal";

        TurController c = new TurController();
        c.salvar(tur);

        for (TurModel pt : c.ler()) {
            System.out.println(pt);
        }
    }
}
