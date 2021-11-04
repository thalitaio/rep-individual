import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * LeituraTerminal
 */
public class LeituraTerminal {

    public static void main(String[] args) {
        try {
            Scanner sc  = new Scanner(new File ("dados/arquivo.txt"));
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        }
    }
}