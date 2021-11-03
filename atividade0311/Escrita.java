import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Escrita {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("dados/estados.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);

            bw.write("Novo Brunswick ");
            bw.write("Terra Nova e Labrador ");
            bw.write("Ilha do Príncipe Eduardo ");
            bw.write("Territórios do Noroeste ");
            bw.write("Nunavut ");
            bw.write("Yukon ");

            //Fechamento necessário para gravação dos dados
            bw.close();
                
            
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não localizado.");
        }catch (IOException e){
            System.out.println("Arquivo não localizado.");
        }
    }
}
