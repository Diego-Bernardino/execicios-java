/*Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Insira a medida da base: ");
        var base = scanner.nextInt();
        System.out.println("Insira a medida da altura:");
        var height = scanner.nextInt();
        var area = base * height;
        System.out.printf("A área do retânglo é %s ", area);
    }
}
