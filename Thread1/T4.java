package Thread1;

public class T4 extends Thread{

	public void run() {
		// TODO Auto-generated constructor stub
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("daemon thread work");
		}
		else
		{
			System.out.println("user thread");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T4 t1=new T4();
		T4 t2=new T4();
		T4 t3=new T4();
		t1.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
