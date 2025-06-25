import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nomeDoCliente = entrada.nextLine();
        
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = entrada.nextLine();
        
        System.out.println("Digite o numero da conta: ");
        int numero = entrada.nextInt();

        System.out.println("Digite seu saldo: ");
        double saldo = entrada.nextDouble();

        System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo "  + saldo + " já está disponível para saque");
    }
}
