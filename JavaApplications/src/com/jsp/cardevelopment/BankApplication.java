package com.jsp.cardevelopment; 
import java.util.Scanner;

class Bank
{
	public double rateOfInterestForHomeLoans() 
	{
		return 0.0;
	}
}

class HDFC extends Bank
{
	@Override
	public double rateOfInterestForHomeLoans() 
	{
		return 0.14;
	}
}

class SBI extends Bank
{
	@Override
	public double rateOfInterestForHomeLoans() 
	{
		return 0.09;
	}
}

class Yes extends Bank
{
	@Override
	public double rateOfInterestForHomeLoans() 
	{
		return 0.07;
	}
}

class SalesMan
{
	public void saleHomeLoansForClients(double amount, Bank bank)
	{
		double rateOfInterest = bank.rateOfInterestForHomeLoans();
		int roiInValue = (int) (rateOfInterest * 100);
		System.out.println(roiInValue + "% of interest to be charged by the bank");
		
		double interestAmount = amount * rateOfInterest;
		System.out.println(interestAmount + " amount of interest to be paid");
		
		double totalAmount = amount + interestAmount;
		System.out.println(totalAmount + "is to be paid");
		 
	}
	
	
//	public void saleHomeLoansForClients(HDFC hdfc)
//	{
//		hdfc.rateOfInterestForHomeLoans();
//		
//	}
//	
//	public void saleHomeLoansForClients(SBI sbi)
//	{
//		sbi.rateOfInterestForHomeLoans();
//		
//	}
//	
//	public void saleHomeLoansForClients(Yes yes)
//	{
//		yes.rateOfInterestForHomeLoans();
//		
//	}
}

public class BankApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Amount: ");
		double amount = scan.nextDouble();
		
		SalesMan sales = new SalesMan();
		sales.saleHomeLoansForClients(amount,new Yes());


	}

}
