package appsecao014fixacaofinal;

import java.util.Locale;
import java.util.Scanner;

import entsecao014fixacaofinal.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Account acc = new Account();
		
		System.out.println("Informe os dados da conta: ");
		System.out.print("Número: ");
		int number = sc.nextInt();
		System.out.print("Titular: ");
		sc.nextLine();
		String holder =sc.nextLine();
		System.out.print("Saldo inicial: ");
		double balance = sc.nextDouble();
		System.out.print("Limite de saque: ");
		double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number,holder, balance, withdrawLimit);
		
        System.out.println();
        System.out.print("Informe uma quantia para sacar: ");
        double amount = sc.nextDouble();
        
        acc.withdraw(amount);
        
        System.out.printf("Novo saldo: %.2fn",acc.getBalance());
        
        sc.close();
	}
}
