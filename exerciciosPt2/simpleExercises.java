import java.util.Scanner;

public class simpleExercises {
// atributos 
    private static String  nome, sobrenome;
    private static int idade;
    public static int numero, A, B, C, opcao;
    public double preco;
    public static String cor, time;

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.println("Loja de Camisas Personalizadas!");
        System.out.println("Digite seu nome: ");
           String nome = scanner.nextLine();
        System.out.println("Digite seu sobrenome: ");
           String sobrenome = scanner.nextLine();
        System.out.println("Digite seu time: ");
         String time = scanner.nextLine();


        System.out.println("Qual sua idade?");
          int idade = scanner.nextInt();
          if(idade >= 18){
            System.out.println("Boas compras!");
          }
          else if(idade >= 15) {
            System.out.println("Você precisa da autorização de um responsável ao finalizar a compra!");
          }
          else{
            System.out.println("Idade não permitida para utilizar nossos serviços!");
            return;
          }

        System.out.println("Bem-vindo " + nome + " " + sobrenome + ", iremos auxiliá-lo a montar sua própria Camisa de Time!");

        System.out.println("Agora, nos ajude a descobrir como seria a sua camisa de time ideal...");
        System.out.println("Digite seu número desejado: ");
         A = scanner.nextInt();
        System.out.println("Qual tamanho da sua camisa?");
         B = scanner.nextInt();
        System.out.println("Quantos centímetros necessários para o número na parte inferior? Ideal: 20cm");
         C = scanner.nextInt();

        scanner.nextLine();

      do { 
          System.out.println("\n---TABELA DE CORES --- ");
          System.out.println("1 - Azul");
          System.out.println("2 - Vermelho");
          System.out.println("3 - Verde");
          System.out.println("0 - Sair");
          System.out.println("Digite a opção desejada: ");
          int opcao = scanner.nextInt();

          switch (opcao) {
            case 1:
             cor = "Azul";
          System.out.println("Você escolheu a cor Azul!");
            break;
            case 2: 
             cor = "Vermelha";
          System.out.println("Você escolheu a cor Vermelha!");
            break;
            case 3: 
             cor = "Verde";
            System.out.println("Você escolheu a cor Verde!");
            break;
            case 0:
            System.out.println("Saindo...");
            break;
            default: 
          System.out.println("Opção inválida, tente novamente.");
          }
        }
        while (opcao != 0);
           
          System.out.println("Cores de camisas do seu time com número " + A + ", tamanho de número: " + B + ", letras com: " + C + "cm.");

          System.out.println("Camisa do: " + time + ", cor: " + cor);

          System.out.println("Volte sempre!");

          scanner.close();
      }
}