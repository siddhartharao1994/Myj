package Tester;

import java.util.Scanner;

import Player.Player;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch=null;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("1.Insert \n2.Delete");
			
			switch(sc.nextInt())
			{
			
			case 1:
				try {
					Player con=new Player();
					System.out.println("enter Pname,Team,Jno,Age");
					String Pname=sc.next();
					String Team=sc.next();
					int Jno=sc.nextInt();
					int Age=sc.nextInt();
					con.Insert(Pname,Team,Jno,Age);
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
				
			case 2:
				try {
					Player con=new Player();
					System.out.println("Enter Pname");
					String Pname=sc.next();
					con.Delete(Pname);
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
			}
			System.out.println("Do you want to continue:");
			ch=sc.next();
			
		}while(ch.equals("y")||ch.contentEquals("Y"));

	}

}
