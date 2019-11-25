package Entities;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LerArquivo {

	public static List<String> leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";

		List<String> palavras = new ArrayList<String>();
		while (true) {
			if (linha != null) {
				palavras.add(linha);
			} else
				break;
			linha = buffRead.readLine();
		}
		buffRead.close();
		return palavras;
	}
}
