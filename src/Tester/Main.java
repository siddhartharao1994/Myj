package Tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import AcTyEnum.AcTy;
import ExceptionHand.AccountHandExcep;
import bankacct.bankacct;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<bankacct> b1 = new ArrayList<bankacct>();
		
		try(Scanner sc = new Scanner(System.in);)
		{
			boolean exit = false;
			int id;
			while(!exit)
			{
				System.out.println(" Opt: \n1.Add Account \n2.Remove Account \n3.Update Account \n4.Sort by id"
						           + "\n5.Sort by name \n6.Exit");
				switch(sc.nextInt())
				{
				case 1:
					System.out.println("Enter your ID:");
					id = sc.nextInt();
					if(b1.contains(id))
					 throw new AccountHandExcep("Acccount already exits");
					else
					{
						System.out.println("Enter your details: AccountName, IFSC, Account type and Balance");
						b1.add(new bankacct(id, sc.next(), sc.next(), AcTy.valueOf(sc.next().toUpperCase()), sc.nextDouble()));
						for(bankacct b:b1)
						{
							System.out.println(b);
						}
					}
					break;
					
				case 2:
					System.out.println("Enter the Account ID:");
					id = sc.nextInt();
					bankacct b2 = new bankacct(id);
					int index = b1.indexOf(b2);
					if(index==-1)
						throw new AccountHandExcep("removal failed: Account doesn't exist");
					else
					{
						System.out.println(b1.remove(b1.get(index)) ? "Account removed":"Failed");
						for(bankacct b:b1)
							System.out.println(b);
						
					}
					break;
					
				case 3:
					System.out.println("Enter the Account id to be updated");
					id = sc.nextInt();
					bankacct b3 = new bankacct(id);
					int index1 = b1.indexOf(b3);
					if(index1==-1)
						throw new AccountHandExcep("Invalid Account Id:");
					else
					{
						System.out.println("ID verified");
						b1.set(index1, new bankacct(sc.next(), sc.next(),AcTy.valueOf(sc.next().toUpperCase()), sc.nextDouble()));
						System.out.println("update successful");
						
					}
					break;
					
				case 4:
					System.out.println("Sorting in process!!");
					Collections.sort(b1);
					for(bankacct b:b1)
						System.out.println(b);
					System.out.println("sorted...");
					break;
					
				case 5:
					exit=true;
					break;	
					
				}
			}
		}
		
	catch(Exception e)
		{
		e.printStackTrace();
		}

	}

}
