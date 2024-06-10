import java.util.Scanner; 

public class ContaTerminal {

    public static void main(String[] args) {

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o número da conta: ");
        numeroConta = input.nextInt();
        
        System.out.println("Informe da agência: ");
        agencia = input.next();
        
        System.out.println("Informe o seu nome: ");
        nomeCliente = input.next();
        
        System.out.println("Informe o saldo disponível em conta: ");
        saldo = input.nextDouble();
        
        System.out.println("Olá " + nomeCliente + ", Obrigado por criar sua conta em nosso banco, sua agência é " + agencia + ", " + "conta " + numeroConta + " e seu saldo de R$ " + saldo + " já está disponível para saque.");
        
                
         
    }

}
