// A soma de três parcelas é 1540. A primeira é 625 e a segunda, 447. Determine a terceira parcela e o resultado da multiplicação das 3 parcelas.



public class ex2 {
  public static void main(String[] args) {
  int somaParcelas = 1540;
  int primeiraParcela = 625;
  int segundaParcela = 447;
  int terceiraParcela = somaParcelas - (primeiraParcela + segundaParcela);
  int multiplicacaoTresParcelas = primeiraParcela * segundaParcela * terceiraParcela;

  System.out.println("Determinando a terceira parcela: " + terceiraParcela); 
  System.out.println("Multiplicação das 3 parcelas: " + multiplicacaoTresParcelas);
  }
}
