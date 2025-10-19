package exercicios;
import java.util.Scanner;

// Crie um programa que calcule e mostre a soma de três números fornecidos pelo usuário

public class ex2 {
  public static void main(String[] args) {
    // entrada de dados
    Scanner sc = new Scanner(System.in); 

     // variáveis 
    int a, b, c, soma;

    // solicitação de dados com quabra de linha 
    a = sc.nextInt(); 
    b = sc.nextInt();
    c = sc.nextInt();

    // soma
    soma = a + b + c;
    
    // resultado com mensagem
    System.out.println("Calculando os dados: " + soma);

    sc.close();
  }
  
}
