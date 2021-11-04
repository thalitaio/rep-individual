import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class EscritaArquivo {
    public static void main(String[] args) {
        
        try {
            InputStream fis = System.in;
            Reader rdr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(rdr);

            OutputStream ot = new FileOutputStream("dados/arquivo.txt");
            Writer wtr = new OutputStreamWriter(ot);
            BufferedWriter bw = new BufferedWriter(wtr);

            String line = "";
            while (line != null && !line.equals("exit")) {
                line = br.readLine();
                bw.write(line + "\n");
            }
            br.close();
            bw.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        } catch(IOException e){
            System.out.println("Não foi possível escrever.");
        }
    }
}
