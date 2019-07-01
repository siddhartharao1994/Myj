package Thread1;

public class Threadgrp implements Runnable {

	public void run() {
		// TODO Auto-generated constructor stub
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadgrp runnable=new Threadgrp();
		ThreadGroup t1=new ThreadGroup("parent");
		
		Thread t2=new Thread(t1,runnable,"one");
		t2.start();
		Thread t3=new Thread(t1,runnable,"two");
		t3.start();
		
		System.out.println("thread group:"+t1.getName());
		t1.list();
	}
}
