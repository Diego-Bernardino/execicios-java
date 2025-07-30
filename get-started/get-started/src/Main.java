import java.util.Scanner;
/* 
public class App {
    private final static String WELCOME_MESSAGE = "Olá, informe o seu nome";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);
        String name = scanner.next();
        System.out.println("Informe sua idade: ");
        int age = scanner.nextInt();
        System.out.printf("Olá %s sua idade é %s \n", name, age);
    }
}


        As declarações de variáveis podem seguir o seguinte padrão:
        var scanner = new Scanner(System.in);
        var name = scanner.next();
        var age = scanner.nextInt();
 


 public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Quanto é 2 + 2? ");
        var result = scanner.nextInt();
        var isRight = result == 4;
        System.out.printf("O resutado é 4, você acertou? (%s) \n", isRight);
        //System.out.printf("O resutado é 4, você acertou? (%s)", result == 4);
        System.out.println("Quantos anos você tem?");
        var age = scanner.nextInt();
        var canDrive = age >= 18;
        System.out.printf("Você pode dirigir? (%s) \n", canDrive);
    }
 }

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        var value1 = scanner.nextInt();
        //System.out.println("Informe o segundo número: ");
        //var value2 = scanner.nextInt();
        //System.out.printf("%s + %s = %s\n", value1, value2, value1 + value2);
        System.out.printf("Araiz quadrada de %s é %s\n", value1, Math.sqrt(value1));
    }
 }

public class Main {
    public static void main(String[] args) {
        var value1 = 4;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro número da operação: %s (representação binária: %s)\n", value1, binary1);
        var value2 = 5;
        var binary2 = Integer.toBinaryString(value2);
        System.out.printf("Segundo número da operação: %s (representação binária: %s)\n", value2, binary2);
        var result = value1 | value2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf(" %s | %s = %s (representação binária: %s)\n", value1, value2, result, binaryResult);
    }
 }

 // 0 = false 
 // 1 = true
 // 100
 // 101
 // 101

public class Main {
    public static void main(String[] args) {
        var value1 = 4;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro número da operação: %s (representação binária: %s)\n", value1, binary1);
        var value2 = 5;
        var binary2 = Integer.toBinaryString(value2);
        System.out.printf("Segundo número da operação: %s (representação binária: %s)\n", value2, binary2);
        var result = value1 & value2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf(" %s | %s = %s (representação binária: %s)\n", value1, value2, result, binaryResult);
    }
 }

// 0 = false 
// 1 = true
// 100
// 101
// 100

public class Main {
    public static void main(String[] args) {
        var value1 = 4;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro número da operação: %s (representação binária: %s)\n", value1, binary1);
        var value2 = 5;
        var binary2 = Integer.toBinaryString(value2);
        System.out.printf("Segundo número da operação: %s (representação binária: %s)\n", value2, binary2);
        var result = value1 ^ value2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf(" %s | %s = %s (representação binária: %s)\n", value1, value2, result, binaryResult);
    }
 }
 
 // 0 = false 
 // 1 = true
 // 100
 // 101
 // 001
 //Se são iguais retorna 0, se diferentes retorna 1


 public class Main {
    public static void main(String[] args) {
        var value1 = 6;
        var binary1 = Integer.toBinaryString(value1);
        var result = ~value1;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf(" ~%s = %s (representação binária: %s)\n", value1, result, binaryResult);
    }
 }
 
 // 0 = false 
 // 1 = true
 // 00000000000000000000000000000110
 // 11111111111111111111111111111001
 // (~ é como um operador d negação)

public class Main {
    public static void main(String[] args) {
        var value1 = 9;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro número da operação: %s (representação binária: %s)\n", value1, binary1);
        var value2 = 5;
        var result = value1 << value2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf(" %s << %s = %s (representação binária: %s)\n", value1, value2, result, binaryResult);
    }
 }
 
 // 0 = false 
 // 1 = true
 // 1001
 // O shift left desloca os bits para a esquerda e prenche as casas vazias a direita com 0. 

public class Main {
    public static void main(String[] args) {
        var value1 = 8;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro número da operação: %s (representação binária: %s)\n", value1, binary1);
        var value2 = 2;
        var result = value1 >> value2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf(" %s >> %s = %s (representação binária: %s)\n", value1, value2, result, binaryResult);
    }
 }
 
 // 0 = false 
 // 1 = true
 // 1001
 // O shift right desloca os bits para a dirita e prenche as casas vazias a esquerda(com a diferença de identificar se o númro é positivo ou negativo, se negativo preenche com 1). 
*/ 

public class Main {
    public static void main(String[] args) {
        var value1 =12;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro número da operação: %s (representação binária: %s)\n", value1, binary1);
        var value2 = 2;
        var result = value1 >>> value2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf(" %s >>> %s = %s (representação binária: %s)\n", value1, value2, result, binaryResult);
    }
 }
 
 // 0 = false 
 // 1 = true
 // 1001
 // O shift asign desloca os bits para a direita e prenche as casas vazias a direita com 0 independentemente se positivo ou negativo. 

 