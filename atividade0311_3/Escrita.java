import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Escrita {
    public static void main(String[] args) {
        
        try {
            FileWriter fw = new FileWriter("dados/arquivo3.txt", true);
            fw.write("Maykon");
            fw.write("a");
            fw.write("a");
            fw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não localizado.");
        } catch (IOException e){
            System.out.println("Não foi possível escrever.");
        }
    }
}
