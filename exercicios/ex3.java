package exercicios;
import java.util.Scanner;

// Desenvolva um programa que pergunte a idade do usuário e verifique se ele é maior de idade

public class ex3 {
  public static void main(String[] args){
//  objeto para leitura de dados
  Scanner sc = new Scanner(System.in);

// solicitação da idade
  System.out.print("Qual sua idade? ");

// idade sendo inteiro + ler a idade digitada
    int idade = sc.nextInt();

// condições   
    if (idade >= 18){
      System.out.println("Você é maior de idade");
    }
    else {
      System.out.println("Você é de menor!");
    }
    sc.close();
  }
  
}
