package sayiBulma;

public class Main {

	public static void main(String[] args) {
		
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
			System.out.println("Sayi mevcuttur");
		} else {
			System.out.println("Sayý mevcut deðildir");
		}

	}

}
