package LinkedList;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedL L1= new LinkedL("Ronaldo","Juventus",7);
		LinkedL L2=new LinkedL("Alexander Arnold","Liverpool",66);
		LinkedL L3= new LinkedL("Tagliafico","Ajax",31);
		LinkedL L4=new LinkedL("Jordi Alba","FCB",18);
		
		LinkedList<LinkedL> l= new LinkedList<LinkedL>();
		l.add(L1);
		l.add(L2);
		l.add(L3);
		l.add(2,L4);
	
		
		Iterator itr= l.descendingIterator();
		while(itr.hasNext())
		{
			LinkedL ll=(LinkedL)itr.next();
			System.out.println(ll.name+" "+ll.team+" "+ll.jerseyno);
		}
		

	}

}
