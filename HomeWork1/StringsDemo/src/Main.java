
public class Main {

	public static void main(String[] args) {

		String mesaj = "Bugün hava çok güzel";
		System.out.println(mesaj);

		/*
		 * System.out.println("Eleman sayýsý:" + mesaj.length());
		 * System.out.println("5.eleman:" + mesaj.charAt(5));
		 * System.out.println(mesaj.concat(" Yaþasýn!"));
		 * System.out.println(mesaj.startsWith("B"));
		 * System.out.println(mesaj.endsWith("B"));
		 * 
		 * char[] karakterler = new char[4]; mesaj.getChars(0, 4, karakterler, 0);
		 * System.out.println(karakterler);
		 * 
		 * System.out.println(mesaj.indexOf("a"));
		 * System.out.println(mesaj.lastIndexOf("a"));
		 */
		System.out.println(mesaj.replace(' ', '-'));
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(5));

		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());// boþluklarý siler
	}

}
