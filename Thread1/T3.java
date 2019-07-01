package Thread1;

public class T3 implements Runnable{

	public void run() {
		// TODO Auto-generated constructor stub
		for(int i=1;i<=5;i++)
		{
			try {Thread.sleep(500);}
			catch(InterruptedException e)
			{ System.out.println(e);}
			System.out.println(i);
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T3 t1=new T3();
		T3 t2=new T3();
		T3 t3=new T3();
		Thread a=new Thread(t1);
		Thread b=new Thread(t2);
		Thread c=new Thread(t3);
		a.start();
		try {
			a.join(1500);
		}catch(Exception e) {System.out.println(e);}
		b.start();
		c.start();

	}

}
