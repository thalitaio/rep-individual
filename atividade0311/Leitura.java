import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 _  Crie um sistema para leitura e escrita em arquivos.
_  Crie uma classe que contenha a estrutura para a leitura de um arquivo de texto, o arquivo deve estar salvo em uma pasta de nome dados. Esta leitura deve conter o fluxo de entrada de dados de um arquivo, um leitor de fluxo e um buffer de leitura. Com o buffer, imprima as linhas do arquivo no console.
_  Crie uma outra classe que contenha a estrutura de escrita em um arquivo de texto, o arquivo deve estar salvo em uma pasta de nome dados. A escrita de conter um fluxo de saída para o arquivo, um forma de escrita no fluxo e um buffer de escrita. Com o buffer, escreva algumas linhas dentro do arquivo texto.
 */
public class Leitura {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("dados/estados.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            
            while (br.ready()) {
                String doc = br.readLine();
                System.out.println(doc); 
            } 
            br.close();
            
            System.out.println("Arquivo ta ok.");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        }catch(IOException e){
            System.out.println("Não leu.");
        }
    }
    
}