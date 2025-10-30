//A quantia R$1.143,00 representa qual porcentagem de R$2.540,00?

public class ex3 {
  public static void main(String[] args) {
  double parte = 1.430;
  double total = 2.540;
  double porcentagem = (parte/total) * 100;

  System.out.printf("Porcentagem de R$ " + parte + ", referente a R$ " + total + ", resulta em: " + porcentagem);
  }
}