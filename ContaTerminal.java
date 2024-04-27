package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int NumeroAgencia; 
		String Nome_Completo;
		String ContaAgencia;
		Double saldoBancario = 237.48;
		
		System.out.println("Por favor, digite o número da Agência!");		
		NumeroAgencia = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite o numero da conta: ");
		ContaAgencia = sc.next();
		sc.nextLine();
		
		System.out.println("Digite seu nome completo: ");
		Nome_Completo = sc.nextLine();
		
		System.out.println("AGÊNCIA: " + NumeroAgencia);
		System.out.println("CONTA: " + ContaAgencia);
		System.out.println("NOME: " + Nome_Completo);
		System.out.println("Olá " + Nome_Completo + ", obrigado por criar uma conta em nosso banco, sua agência é " + NumeroAgencia + ", conta " + ContaAgencia + " e seu saldo R$" + saldoBancario + " já está disponível para saque");
		
		sc.close();

	}
}

