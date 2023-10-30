import java.util.Scanner;
public class Main {
    static double num1;
    static double num2;
    double result;
    static char operator;
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();
        System.out.print("Digite a operação (+, -, *, /): ");
        operator = scanner.next().charAt(0);
        scanner.close();
        double result;

        switch(operator) {
            case '+':
                result = Calculadora.soma(num1,num2);
                break;
            case '-':
                result = Calculadora.subtrair(num1,num2);
                break;
            case '*':
                result = Calculadora.produto(num1,num2);
                break;
            case '/':
                result = Calculadora.dividir(num1,num2);
                break;
            default:
                System.out.println("Operação inválida.");
                return;
        }
        System.out.println(num1+" "+operator+" "+num2+": "+ result);
        System.out.printf("%.02f %s %.02f = %.02f", num1, operator, num2, result);
    }
    }