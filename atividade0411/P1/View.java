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
    private static String fileName = "P1/Empresas.csv";
    public static void main(String[] args) {
        
        Empresa e = new Empresa();
        e.nome = "Havaianas";
        e.cnpj = "11234567890";
        e.atividade = "Sandálias Overpriced";

        String empresaString = String.format("Nome: %s ; CNPJ: %s ; Atividade: %s \n", e.nome, e.cnpj, e.atividade);

        try {
            FileWriter fw = new FileWriter(fileName, true);
            fw.write(empresaString);
            fw.close();
        } catch (IOException ex) {
            System.out.println("Não foi possível ler o arquivo.");
        }
//leitura
        try {
            Scanner sc = new Scanner(new File(fileName));
            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                String [] empresaItem = linha.split(";");
                //String para obj
                Empresa e2 = new Empresa();
                e2.nome = empresaItem[0];
                e2.cnpj = empresaItem[1];
                e2.atividade = empresaItem[2];

                System.out.printf("%s ; %s ; %s \n", e2.nome, e2.cnpj, e2.atividade);
            }
        } catch (Exception ex) {
            System.out.println("O arquivo não pode ser lido.");
        }
    }
    
}
