package Aplication;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Entities.ImprimeAnagramas;
import Entities.LerArquivo;
import Entities.TestaPalavra;

public class Program {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com uma palavra, ou frase");
		String frase = sc.nextLine();
		frase.toUpperCase();
		sc.close();

		TestaPalavra.testarNome(frase);
		String[] s1 = ImprimeAnagramas.geraAnagramas(frase);
		System.out.println("$ ./anagrama " + frase);
		for (int i = 0; i < s1.length; i++) {

			System.out.println("" + s1[i]);
		}

		String path = "C:\\Users\\Marina\\eclipse-workspace\\Hackathon\\palavras.txt.txt";
		List<String> palavras = LerArquivo.leitor(path);

		int[] cont = { 0 };
		palavras.forEach(e -> {
			if (TestaPalavra.testarNome(e)) {
				String[] s = ImprimeAnagramas.geraAnagramas(e);
				System.out.println("$ ./anagrama " + s[0]);
				for (String value : s) {
					System.out.println(value);

				}
				cont[0] += s.length;
			}

		});

		System.out.println("$ ./anagrama" + " anagramas.");

	}
}
