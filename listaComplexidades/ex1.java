// Em um zoológico, há 15 leões, 26 zebras, 14 macacos e 29 serpentes. Quantos animais há nesse zoológico? Qual o total de patas?

public class ex1 {
  public static void main(String[] args) {
    int leoes = 15;
    int zebras = 26;
    int macacos = 14;
    int serpentes = 29;

    int totalAnimais = leoes + zebras + macacos + serpentes; 
    int quantidadePatas = (leoes * 4) + (macacos * 4) + (zebras * 4);

    System.out.println("Quantidade de animais: " + totalAnimais);
    System.out.println("Quantidade de Patas: " + quantidadePatas);
    
  }
}