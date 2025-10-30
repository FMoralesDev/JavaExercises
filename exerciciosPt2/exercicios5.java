// peça 4 notas e mostre a média final
import java.util.Scanner;

public class exercicios5 {
  public double primeiraNota, segundaNota, terceiraNota, quartaNota, mediaFinal;

  public exercicios5(double primeiraNota, double segundaNota, double terceiraNota, double quartaNota) {
    this.primeiraNota = 0.0;
    this.segundaNota = 0.0;
    this.terceiraNota = 0.0;
    this.quartaNota = 0.0;
  }
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Primeira nota: ");
      double primeiraNota = sc.nextDouble();
      System.out.println("Segunda nota: ");
      double segundaNota = sc.nextDouble();
      System.out.println("Terceira nota: ");
      double terceiraNota = sc.nextDouble();
      System.out.println("Quarta nota: ");
      double quartaNota = sc.nextDouble();
      double media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4.0;
      System.out.println("Média final: " + media);
  }
}