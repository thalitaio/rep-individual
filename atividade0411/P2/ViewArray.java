package P2;

public class ViewArray {
    public static void main(String[] args) {
        IController c = new TurControllerList();
        TurModel tur = new TurModel();
        tur.nome = "Férias perfeitas";
        tur.localizacao = "No mar";
        tur.descricao = "Bronze e água de coco";
        String add1 = c.salvar(tur.nome);
        String add2 = c.salvar(tur.localizacao);
        String add3 = c.salvar(tur.descricao);

        System.out.printf(" | Nome: %s | Localização: %s | Descrição: %s \n" ,add1, add2, add3);

        for (String d : c.ler()) {
            System.out.println(d);
        }
    }
}
