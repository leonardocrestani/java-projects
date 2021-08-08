package contabancaria;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**       BANCO       **");
		System.out.println("** Abertura de conta **");
		
		System.out.print("Digite o seu nome: ");
		String nome = sc.nextLine();
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = sc.nextLine();
		System.out.print("Digite seu CPF: ");
		String cpf = sc.nextLine();
			
		Cliente cliente = new Cliente(nome, sobrenome, cpf);
			
		System.out.println("1 - Conta Corrente");
		System.out.println("2 - Conta Poupanca");
		int tipoConta = sc.nextInt();
			
			
		if(tipoConta == 1) {
			System.out.print("Digite o numero da conta: ");
			int numeroConta = sc.nextInt();
			ContaCorrente conta = new ContaCorrente(numeroConta, cliente);
			System.out.print("Deseja fazer um deposito inicial: S/N: ");
			String depositoInicial = sc.next();
			boolean isInitialDeposit = conta.temDepositoInicial(depositoInicial);
			if(isInitialDeposit) {
				System.out.print("Digite o valor do deposito: ");
				conta.depositoInicial(sc.nextDouble());
				System.out.println("\n" + "Sua conta foi criada com sucesso !" + "\n" + conta.accountInfo());
			}
			else {
				System.out.println("\n" + "Sua conta foi criada com sucesso !" + "\n" + conta.accountInfo());
			}
		}
		else {
			System.out.print("Digite o numero da conta: ");
			int numeroConta = sc.nextInt();
			ContaPoupanca conta = new ContaPoupanca(numeroConta, cliente);
			System.out.print("Deseja fazer um deposito inicial: S/N: ");
			String depositoInicial = sc.next();
			boolean isInitialDeposit = conta.temDepositoInicial(depositoInicial);
			if(isInitialDeposit) {
				System.out.print("Digite o valor do deposito: ");
				conta.depositoInicial(sc.nextDouble());
				System.out.println("\n" + "Sua conta foi criada com sucesso !" + "\n" + conta.accountInfo());
			}
			else {
				System.out.println("\n" + "Sua conta foi criada com sucesso !" + "\n" + conta.accountInfo());
			}
		}
		
		sc.close();
		
	}
}
