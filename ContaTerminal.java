package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int numeroAgencia; 
		String nome_Completo;
		String contaAgencia;
		Double saldoBancario = 237.48;
		
		System.out.println("Por favor, digite o número da Agência!");		
		numeroAgencia = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite o numero da conta: ");
		contaAgencia = sc.next();
		sc.nextLine();
		
		System.out.println("Digite seu nome completo: ");
		nome_Completo = sc.nextLine();
		
		System.out.println("AGÊNCIA: " + numeroAgencia);
		System.out.println("CONTA: " + contaAgencia);
		System.out.println("NOME: " + come_Completo);
		System.out.println("Olá " + nome_Completo + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + contaAgencia + " e seu saldo R$" + saldoBancario + " já está disponível para saque");
		
		sc.close();

	}
}

