package Lista.calculadoraV3;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operador = "";

        System.out.println("--------------------");
        System.out.println("| + | - | / | * |");
        System.out.println("--------------------");
        System.out.println("S -> Sair");
        System.out.println("Digite a operação desejada: ");
        operador = scanner.nextLine();

        if (!operador.equals("S")) {
            System.out.println("Digite o primeiro número: ");
            double op1 = Double.parseDouble(scanner.nextLine());
            System.out.println("Digite o segundo número: ");
            double op2 = Double.parseDouble(scanner.nextLine());

            if (operador.equals("+")) {
                double resultado = op1 + op2;
                System.out.println(op1 + " + " + op2 + " = " + resultado);
            } else if (operador.equals("-")) {
                double resultado = op1 - op2;
                System.out.println(op1 + " - " + op2 + " = " + resultado);
            } else if (operador.equals("*")) {
                double resultado = op1 * op2;
                System.out.println(op1 + " * " + op2 + " = " + resultado);
            } else if (operador.equals("/")) {
                if (op2 != 0) {
                    double resultado = op1 / op2;
                    System.out.println(op1 + " / " + op2 + " = " + resultado);
                } else {
                    System.out.println("Divisão por zero não é permitida.");
                }
            } else {
                System.out.println("Operador inválido.");
            }
        }
    }
}
