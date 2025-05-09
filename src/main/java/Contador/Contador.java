package Contador;

import java.util.Scanner;
import Contador.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Receber dois números inteiros via terminal
        System.out.println("Digite o primeiro número:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int numero2 = scanner.nextInt();

        try {
            contar(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    static void contar(int numero1, int numero2) throws ParametrosInvalidosException {
        if (numero1 > numero2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int qtdInteracoes = numero2 - numero1;
        for (int i = 1; i <= qtdInteracoes; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
