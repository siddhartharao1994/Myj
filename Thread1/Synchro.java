package Thread1;

public class Synchro {

	synchronized void printtable(int n) {
		// TODO Auto-generated constructor stub
		for(int i=0;i<=10;i++)
		{
			System.out.println(n*i);
			try {
				Thread.sleep(100);
			}
			catch(Exception e) {System.out.println(e);}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Synchro s=new Synchro();
		
		Thread t1=new Thread() {
			public void run() {
				s.printtable(2);
			}
		};
		
		Thread t2=new Thread() {
			public void run() {
				s.printtable(10);
			}
		};
       
		t1.start();
		t2.start();
	}

}
