package Esercizio3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class RegistroPresenze {

	private String nome;
	private int giorniPresenza;
	private static File file = new File("File.txt");

	public static List<RegistroPresenze> lista = new ArrayList<>();

	public RegistroPresenze(String nome, int giorniPresenza) {
		this.setNome(nome);
		this.setGiorniPresenza(giorniPresenza);
	}

	public static void saveDisk(List<RegistroPresenze> lista) {
		try {
			List<String> lines = new ArrayList<>();
			for (RegistroPresenze elemento : lista) {
				lines.add(elemento.toString());
			}
			FileUtils.writeLines(file, "UTF-8", lines, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String readDisk() throws IOException {
		if (file.exists()) {
			String cont = FileUtils.readFileToString(file, "UTF-8");
			System.out.println(cont);
			return cont;
		} else {
			System.out.println("File non trovate");
			return "";
		}
	}

	public static void aggiungiElemento(String nome, int giorniPresenza) {
		RegistroPresenze elemento = new RegistroPresenze(nome, giorniPresenza);
		lista.add(elemento);
	}

	public static void stampaRegistro() {
		for (RegistroPresenze elemento : lista) {
			System.out.println(elemento);
		}
	}

	@Override
	public String toString() {
		return "Nome:" + getNome() + " Presenze:" + getGiorniPresenza();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getGiorniPresenza() {
		return giorniPresenza;
	}

	public void setGiorniPresenza(int giorniPresenza) {
		this.giorniPresenza = giorniPresenza;
	}

}
