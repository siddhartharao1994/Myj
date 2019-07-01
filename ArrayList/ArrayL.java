package ArrayList;
import java.util.*;

public class ArrayL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1=new Player("Messi",10,"Argentina");
		Player p2=new Player("Van Djik",4,"Netherlands");
		Player p3=new Player("Iniesta",8,"Spain");
		
		ArrayList<Player> pl=new ArrayList<Player>();
		pl.add(p1);
		pl.add(p2);
		pl.add(p3);
		
		
		Iterator itr=pl.iterator();
		while(itr.hasNext()) {
		Player py=(Player)itr.next();
		System.out.println(py.name+" "+py.jerseyno+" "+py.team);
		}
		
		

	}
	

}
