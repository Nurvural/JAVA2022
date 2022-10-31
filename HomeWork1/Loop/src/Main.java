
public class Main {

	public static void main(String[] args) {
		// for
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("For döngüsü bitti");
		// while
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While döngüsü bitti");

		// Do-while
		int j = 1;
		do {
			System.out.println(j);
			j++;
		} while (j < 5);
		System.out.println("Do-While döngüsü bitti");
	}

}
