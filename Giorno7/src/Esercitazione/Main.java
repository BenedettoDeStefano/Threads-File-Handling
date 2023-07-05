package Esercitazione;

public class Main {

	public static void main(String[] args) {

		Thread t1 = new Symbol("*");
		Thread t2 = new Symbol("#");

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
