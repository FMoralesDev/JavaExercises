// converta uma temperatura em Celsius para Fahrenheit, F = C * 1.8 + 32
import java.util.Scanner;

public class exercicios6 {
  public double temperaturaCelsius, conversaoFahrenheit;

  public exercicios6(double conversaoFahrenheit, double  temperaturaCelsius) {
    this.conversaoFahrenheit = 68.0;
    this.temperaturaCelsius = (temperaturaCelsius - 32) * 5.0 / 9.0;
  }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite a temperatura em Celsius: ");
      double temperaturaCelsius = sc.nextDouble();
      System.out.println("Conversão: " + temperaturaCelsius);
    }
  } 

