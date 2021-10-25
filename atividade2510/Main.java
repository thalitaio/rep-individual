/*
_  Crie uma calculadora para realizar as quatro operações básicas: soma, subtração, multiplicação e divisão.
_  Deve possuir um menu para o usuário escolher a operação a realizar.
_  O sistema deve possuir um tratamento de exceção para evitar erro em uma divisão por zero.
_  O sistema deve possuir um tratamento de exceção durante a leitura dos dados para evitar que o usuário insira algo diferente de números inteiros tanto para as operação quanto para o menu.

*/
package atividade2510;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        int n1 = 0;
        int n2 = 0;
        do {
            opcao = menu(sc);
            n1 = entrada("Digite o primeiro número: ");
            n2 = entrada("Digite o segundo número: ");
            switch (opcao) {
                case 1:
                    System.out.println("O resultado da soma é: " + soma(n1, n2));
                    break;
                case 2:
                    System.out.println("O resultado da subtração é: " + subtrai(n1, n2));
                    break;
                case 3:
                        try {
                            System.out.println("O resultado da divisão é: " + divide(n1, n2));
                        } catch (ArithmeticException e){
                            System.out.println("O divisor não pode ser igual a 0. Digite novamente! ");
                            opcao = -1;
                        }
                    break;
                case 4:
                    System.out.println("O resultado da multiplicação é: " + multiplica(n1, n2));
                    break;
                case 0:
                    System.out.println("Obrigada por calcular conosco. Até breve!");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    
    private static int menu(Scanner sc) {
        System.out.println("\nEscolha a operação desejada:\n1-Soma\n2-Subtração\n3-Divisão\n4-Multiplicação\n0-Sair\n");
        int opcao = Integer.parseInt(sc.nextLine());
        return opcao;
    }

    private static int soma(int n1, int n2){
        return n1 + n2;
    }

    private static int subtrai(int n1, int n2){
        return n1 - n2;
    }

    private static int divide(int n1, int n2){
        return n1 / n2;
    }

    private static int multiplica(int n1, int n2){
        return n1 * n2;
    }

    public static int entrada(String mensagem) {
        int n = 0;
        boolean valido;
        do {
            System.out.println(mensagem);
            try {
                n = Integer.parseInt(sc.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Dado inválido. Digite novamente.");
                valido = false;
            }
        } while (!valido);
        return n;
    }



}
