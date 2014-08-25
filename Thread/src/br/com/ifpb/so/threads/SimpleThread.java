package br.com.ifpb.so.threads;

public class SimpleThread extends Thread {
	
	public SimpleThread(String str) {
		super(str);
	}

	public void run() {

		for (int i = 0; i < 10; i++) {

			System.out.println(i + " " + getName());

			try {
				sleep((long)(Math.random() * 1500));
			} catch (InterruptedException e) {}
		}

		System.out.println("DONE! " + getName());
	}
}