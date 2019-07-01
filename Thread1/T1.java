package Thread1;

public class T1 extends Thread {

	public void run() {
		// TODO Auto-generated constructor stub
		System.out.println("Running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T1 t=new T1();
	    t.start();

	}

}
