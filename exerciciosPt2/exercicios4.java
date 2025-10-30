// peça o nome, idade e estado do usuario: exiba: "Ola [nome], voce tem [idade] anos e mora no estado do [estado]"
import java.util.Scanner;

public class exercicios4 {
  public String nome, estado;
  public int idade;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      System.out.println("Digite seu nome: ");
      String nome = sc.nextLine();
      System.out.println("Digite seu estado: ");
      String estado = sc.nextLine();
      System.out.println("Digite sua idade: ");
      int idade = sc.nextInt();

      System.out.println("Olá " + nome + ", você tem " + idade + " anos, e mora no estado do " + estado);
      sc.close();
  }
}
