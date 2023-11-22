package poo.test;
import java.util.Scanner;
public class TestScanner {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valorDigitado = leitor.nextInt();

        System.out.println("Valor Digitado: "+ valorDigitado);

    }
}
