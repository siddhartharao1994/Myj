package TreeSet;

public class TreeS implements Comparable<TreeS>{
	int Jno,Age;
	String Pname,Team;

	public TreeS() {
		// TODO Auto-generated constructor stub
	}

	public TreeS(int jno, int age, String pname, String team) {
		super();
		Jno = jno;
		Age = age;
		Pname = pname;
		Team = team;
	}

	@Override
	public int compareTo(TreeS l) {
		// TODO Auto-generated method stub
		if(Jno>l.Jno)
		{
			return 1;
		}
		else if(Jno<l.Jno)
		{
			return -1;
		}
		else 
		{
			return 0;
	    }

}}
