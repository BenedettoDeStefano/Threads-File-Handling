package Esercitazione;

public class Symbol extends Thread {

	private String simbolo;

	public Symbol(String simbolo) {
		this.simbolo = simbolo;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(simbolo);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
