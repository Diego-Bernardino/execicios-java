/*Escreva um código que receba o nome e o ano de nascimento e imprima na tela a seguinte mensagem: Olá "Nome", você tem "x" anos.*/

import java.time.OffsetDateTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    var year = OffsetDateTime.now().getYear();
    var scanner = new Scanner(System.in);
    System.out.printf("Insira seu nome: ");
    var name = scanner.next();
    System.out.printf("Insira seu ano de nascimento: ");
    var birthYear = scanner.nextInt();
    var age = year - birthYear;
    System.out.printf("Olá %s, você tem %s anos.", name, age);
    }
}
