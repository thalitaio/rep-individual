package P1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
_  Crie um sistema para cadastro de Empresas. A empresa deve possuir três atributos públicos: nome, cnpj e ramo de atividade OK
_  Utilize o padrão DAO para criar uma estrutura de armazenamento de dados em um arquivo do tipo CSV.OK
_  A estrutura de armazenamento deve apenas salvar e ler os dados. 
_  Os dados devem ser convertidos de Objeto para String ao salvar.
_  Os dados devem ser convertidos de String para Objeto ao ler.
_  Utilize os métodos de leitura e escrita em uma classe View.

*/
public class View {
    public static void main(String[] args) {
        Empresa e = new Empresa();
        e.nome = "Havaianas";
        e.cnpj = "11234567890";
        e.atividade = "Sandálias Overpriced";

        try {
            FileWriter fw = new FileWriter("P1/Empresas.csv", true);
            fw.write(e.nome + " ; " + e.cnpj + " ; " + e.atividade + "\n" );
            fw.close();
        } catch (IOException ex) {
            System.out.println("Não foi possível ler o arquivo.");
        }
//leitura
        try {
            Scanner sc = new Scanner(new File("p1/EMpresas.csv"));
            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                //String para obj
                String [] empresaItem = linha.split(";");
                Empresa e2 = new Empresa();
                e2.nome = empresaItem[0];
                e2.cnpj = empresaItem[1];
                e2.atividade = empresaItem[2];

                System.out.printf("Nome: %s - CNPJ: %s - Atividade: %s \n", e2.nome, e2.cnpj, e2.atividade);
            }
        } catch (Exception ex) {
            System.out.println("O arquivo não pode ser lido.");
        }
    }
    
}
