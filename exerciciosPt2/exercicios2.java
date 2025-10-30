// programa pra ler dois valores inteiros e mostrar na tela a soma com uma msg explicativa 

import java.util.Scanner;

public class exercicios2 {
  public int primeiroValor, segundoValor, x;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o primeiro valor: ");
    int primeiroValor = sc.nextInt();
    System.out.println("Digite o segundo valor: ");
    int segundoValor = sc.nextInt();
    int x = primeiroValor + segundoValor;
    sc.close();
    System.out.println("Soma total: " + x);
  }

}


