package br.com.ifpb.so.threads;

public class TwoThreadsTest {

	public static void main(String[] args) {

		SimpleThread myThread = new SimpleThread("myThread");
		SimpleThread ourThread = new SimpleThread("ourThread");
		
		myThread.start();
		//myThread.run();
		
		ourThread.start();
		//ourThread.run();
	}

}
