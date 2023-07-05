package Esercizio3;

public class Main {

	public static void main(String[] args) {

		RegistroPresenze.aggiungiElemento("Benedetto", 26);
		RegistroPresenze.aggiungiElemento("Francesco", 40);
		RegistroPresenze.aggiungiElemento("Leonardo", 60);

		RegistroPresenze.stampaRegistro();

		for (RegistroPresenze elemento : RegistroPresenze.lista) {
			RegistroPresenze.saveDisk(RegistroPresenze.lista);
		}
	}

}
