package atividade309;
import java.util.Scanner;

public class PrincipalCalTaxas {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        menu();

    }

    static void menu(){
        
        CalculadoraTaxas calc = new CalculadoraTaxas();
        boolean continua;
        

        do{
        System.out.println("Digite a transação desejada");
        System.out.println("1 -- Transferência  ||  2 -- Saque");
        int opcaoMenu = sc.nextInt();

        switch (opcaoMenu) {
            case 1:
                System.out.println("Digite o valor:");
                double valor = sc.nextInt();
                System.out.println("Saldo atual: " + calc.taxaTransacao(valor));
                continua = retorna();
            break;


            case 2:
                System.out.println("Digite o valor total: ");
                double valorInicial = sc.nextInt();
                System.out.println("Taxa atual: " + calc.taxaSaque(valorInicial)); 
                continua = retorna();
            break;
        
            default:
                System.out.println("Opção inválida. Digite novamente: ");
                opcaoMenu = sc.nextInt();
                continua = true;
                break;
        }
        } while(continua);
    }

    static boolean retorna(){
        System.out.print("\nDeseja voltar ao menu inicial?\n Digite 1 para SIM ou 2 para NÃO: ");
            int opcContinua = sc.next().charAt(0);
            boolean continua;

            while (opcContinua != '1' && opcContinua != '2') {
                System.out.print("Opção inválida. Digite novamente: ");
                opcContinua = sc.next().charAt(0);
            }

            if (opcContinua == '1') {
                continua = true;
            } else {
                continua = false;
            }
            return continua;
    }


}
