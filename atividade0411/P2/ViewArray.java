package P2;

public class ViewArray {
    public static void main(String[] args) {

        TurModel tur = new TurModel();
        tur.nome = "Cristo Rei";
        tur.localizacao = "Almada";
        tur.descricao = "Cristo redentor de Portugal";

        TurControllerList c = new TurControllerList();
        c.salvar(tur);

        for (TurModel d : c.ler()) {
            System.out.println(d);
        }
    }
}
