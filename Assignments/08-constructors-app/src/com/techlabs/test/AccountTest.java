package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Account;
import com.techlabs.model.AccountType;

public class AccountTest {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		Account accounts[]=new Account[3];
		
		for(int i=0;i<accounts.length;i++)
		{
			accounts[i]=new Account();
			System.out.println("Enter Account Number: ");
			accounts[i].setAccountNumber(scanner.nextInt());
			System.out.println("Enter Account Holder Name: ");
			accounts[i].setName(scanner.next());
			System.out.println("Enter Account Balance: ");
			accounts[i].setBalance(scanner.nextDouble());
			System.out.println("Enter Account Type:For savings: press 1 and for current: press 2 ");
			int accountType=scanner.nextInt();
			if(accountType==1)
			accounts[i].setAccountType(AccountType.Savings);
			if(accountType==2)
			accounts[i].setAccountType(AccountType.Current);	
		}
		
		for(int i=0;i<accounts.length;i++)
		{
			System.out.print(accounts[i]);
			System.out.println("");
		}
		
		for(Account account:accounts)
		{
			System.out.println(account);
		}

		
	}

}
