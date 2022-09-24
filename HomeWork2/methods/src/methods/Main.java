package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 4, 5, 7, 8, 0 };
		int aranacakSayi = 3;
		boolean varMi = false;

		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] == aranacakSayi) {
				varMi = true;
				break;
			}
		}
		if (varMi) {
			mesajVer(aranacakSayi + " sayýsý mevcuttur");
		} else {
			mesajVer(aranacakSayi + " sayýsý mevcut deðildir");
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
