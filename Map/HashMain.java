package Map;

import java.util.*;

public class HashMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,hashmap> m= new HashMap<Integer,hashmap>();
		hashmap p1= new hashmap(10,"Van Persie","ManU","Netherlands");
		hashmap p2=new hashmap(4,"Van Dijk","Liverpool","Netherlands");
		hashmap p3=new hashmap(23,"Jamie Carragher","Liverpool","England");
		hashmap p4=new hashmap(5,"Zinedin Zidan","Rael Madrid","France");
		
		m.put(1, p1);
		m.put(2, p2);
        m.put(3, p3);
        m.putIfAbsent(4, p4);
        m.remove(3);
        
        
        for(Map.Entry<Integer, hashmap> t:m.entrySet())
        {
        	int key=t.getKey();
        	hashmap h=t.getValue();
        	System.out.println(key+ " Details");
        	System.out.println(h.jerseyno+" "+h.name+" "+h.team+" "+h.country);
        }
        
	}

}
