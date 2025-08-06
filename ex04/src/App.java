/*Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Insira o nome da primeira pessoa: ");
        var name = scanner.next();
        System.out.println("Insira a idade da primeira pessoa: ");
        var age = scanner.nextInt();
        System.out.println("Insira o nome da segunda pessoa: ");
        var name2 = scanner.next();
        System.out.println("Insira a idade da sgunda pessoa: ");
        var age2 = scanner.nextInt();
        var ageDifference = age > age2 ? age - age2 : age2 - age;
        System.out.printf("A diferença de idade entre %s e %s é de %s anos.", name, name2, ageDifference);
    }
}
