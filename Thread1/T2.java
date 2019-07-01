package Thread1;

public class T2 implements Runnable{

	public void run() {
		// TODO Auto-generated constructor stub
		System.out.println("Running thread name is:"+Thread.currentThread().getName());
		System.out.println("Running thread priority is:"+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T2 t=new T2();
		T2 s=new T2();
		Thread t1=new Thread(t);
		Thread t2=new Thread(s);
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();

	}

}
