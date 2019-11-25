package Entities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestaPalavra {

	public static boolean testarNome(String palavra) {
		if (palavra == "null") {
			System.out.println("Em branco!");
			return false;

		} else {
			Pattern pattern = Pattern.compile("[áàéèíìóòúùãç0123456789!@#$%¨&*]");
			Matcher matcher = pattern.matcher(palavra);
			if (matcher.find()) {
				System.out.println("Contém caracter não válido!");
				System.exit(0);
				return false;
			}
			return true;

		}

	}

}
/*
 * public class TestaPalavra { String palavra;
 * 
 * public void testarNome(String palavra){ this.palavra = palavra; if(palavra ==
 * "null"){ System.out.println("Em branco!");
 * 
 * } else{ Pattern pattern =
 * Pattern.compile("[áàéèíìóòúùãç0123456789!@#$%¨&*]"); Matcher matcher =
 * pattern.matcher(palavra); if(matcher.find()){
 * System.out.println("Contém caracter não válido!"); }
 */
