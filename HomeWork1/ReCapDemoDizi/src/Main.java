
public class Main {

	public static void main(String[] args) {
		
		double[] myList = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		double total = 0;
		double max = myList[0];
		
		for (double number : myList) {
			if (max < number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}
		System.out.println("toplam:" + total);
		System.out.println("en b�y�k:" + max);
	}

}
