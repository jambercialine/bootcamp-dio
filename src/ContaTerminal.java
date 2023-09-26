import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int numeroDaConta;
		String agencia;
		String nomeCliente;
		double saldo;
		
		System.out.print("Por favor, digite o número da agência: ");
		numeroDaConta = sc.nextInt();
		
		
		System.out.print("Por favor, digite o nome da agência: ");
		agencia = sc.next();
		
		
		System.out.print("Por favor, digite o nome do cliente: ");
		nomeCliente = sc.next();
		sc.nextLine();
	
	
		System.out.print("Por favor, digite o seu saldo: ");
		saldo = sc.nextDouble();
		System.out.println();
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " +
		agencia + ", conta " + numeroDaConta + " e seu saldo de R$ " + saldo + " já esta disponível para saque!");
		
		sc.close();

	}

}
