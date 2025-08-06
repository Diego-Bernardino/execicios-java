/*Escreva um código que receba o tamanho do lado de um quadrado, calcule sua ára e exiba na tela */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Insira a medida do lado do quadrado: ");
        var squareSide = scanner.nextInt();
        var area = Math.pow(squareSide, 2);
        System.out.printf("A área do quadrado é de %s", area);
    }
}
