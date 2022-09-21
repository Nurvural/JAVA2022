
public class Main {

	public static void main(String[] args) {
		int sayi1 = 20;
		int sayi2 = 25;
		int sayi3 = 10;
		int enBuyuk = sayi1;
		
		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}
		if (enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}
		System.out.println("En Buyük Sayi:" + enBuyuk + "'dir");
		/*
		 * if (sayi1 > sayi2 && sayi1 > sayi2) { System.out.println(sayi1); } else if
		 * (sayi2 > sayi3 && sayi2 > sayi3) { System.out.println(sayi2); } else {
		 * System.out.println(sayi3); }
		 */


	}

}
