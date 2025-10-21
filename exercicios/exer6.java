// Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
import java.util.Scanner;

public class exer6 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Nesse sistema iremos mostrar a diferença do produto A e B, pelo produto C e D.");
    
    System.out.println("Digite o produto A:");
    int A = scanner.nextInt();
    System.out.println("E digite o produto B:");
    int B = scanner.nextInt();
    System.out.println("Agora, veremos a diferença. Logo, digite o produto C:");
    int C = scanner.nextInt();
    System.out.println("E por ultimo, digite o produto D:");
    int D = scanner.nextInt();
    
    int diferenca = (A * B) - (C * D);

    System.out.println("Resultado: " + diferenca);

    scanner.close();
    
  }
}