import java.util.Scanner;

// Declare uma variável para armazenar o nome de uma pessoa e exiba essa variável

public class exer4 {
  public static void main(String[] arg){

// leitura de dados
  Scanner sc = new Scanner(System.in);

// solicitação de dados
    System.out.print("Nome próprio: ");

// nome é uma string + inserção de dados
    String nome = sc.nextLine();

// resultado
    System.out.println("Seu nome é: " + nome);
    sc.close();
  }
  
}
