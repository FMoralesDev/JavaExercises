package exercicios;
import java.util.Scanner;

public class ex2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a, b, c, soma;

    a = sc.nextInt(); 
    b = sc.nextInt();
    c = sc.nextInt();
    
    soma = a + b + c;

    System.out.println("Calculando os dados: " + soma);

    sc.close();
  }
  
}
