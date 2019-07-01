package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<TreeS> p=new TreeSet<TreeS>();
		
		TreeS p1=new TreeS(10,32,"Messi","FCB");
		TreeS p2=new TreeS(7,34,"Ronaldo","Juventus");
		TreeS p3=new TreeS(4,27,"Virgil","Liverpool");
		TreeS p4=new TreeS(11,27,"Sadio","Liverpool");
		TreeS p5=new TreeS(14,32,"Henderson","liverpool");
		
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5);
		
		Iterator i=p.descendingIterator();
		while(i.hasNext())
		{
			TreeS t=(TreeS)i.next();
			System.out.println(t.Jno+" "+t.Age+" "+t.Pname+" "+t.Team);
		}
	
		
	}

}
