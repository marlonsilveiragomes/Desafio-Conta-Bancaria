import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class contaBancaria {

    public static void main(String[] args) {

        String nome = "Carlos Drumond de Andrade";
        String conta = "corrente";
        double saldo = 14500.00;
        int opcao = 0;

        System.out.println("\n#################################");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + conta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n#################################");

        String menu = """
                \n## Digite a Opção Desejada ##
                1 - Seu Saldo
                2 - Fazer Tranferência Pix
                3 - Receber Transferência PIX
                4 - Finalizar                
                """;
        Scanner leitura = new Scanner(System.in);


        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O Seu Saldo é de: " + saldo);
            } else if (opcao == 2) {
                System.out.println("\nDigite o valor da transferência pix: ");
                double valor = leitura.nextDouble();
                if (saldo < valor) {
                    System.out.println("\nValor do saldo insuficiente para esta operação");
                } else {
                    saldo = saldo - valor;
                    System.out.println("\nNovo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("\nDigite o valor  transferência pix a receber: ");
                double valor = leitura.nextDouble();
                saldo = saldo + valor;
                System.out.println("Seu novo saldo: " + saldo);

                } else if (opcao !=4) {
                System.out.println("Opcao invalida");

                }

            }

          }

        }




