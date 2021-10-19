package atividade1910;

public class Dados {
    int posicao = 0;
    private Object [] dados;
    public Dados(){
        this.dados = new Object[5];
    }

    public String add(Object obj) {
        if (posicao < dados.length) {
            dados[posicao] = obj;
            posicao++;
            
        }else{
            Object[] dados2 = new Object[dados.length + 5];
            dados = dados2;
        }
        return "Item adicionado. \n";
    }

    public int posicao() {
        return posicao;
    }

    public String remove(Object obj) {
        for (int i = 0; i < dados.length; i++) {
            if (dados[i].equals(obj)) {
                posicao--;
                return "Item removido.\n";
            }
        }
        return "Não encontrado.\n";
    }

    public String verificar(Object obj){
        for (int i = 0; i < dados.length; i++) {
            if(dados[i].equals(obj)){
                return "O item já existe.\n";
            }
        }
        return "O item não esta cadastrado.\n";
    }

    public void imprime(){
        for (int i = 0; i < posicao; i++) {
            System.out.println(dados[i]);
        }
    }
}
