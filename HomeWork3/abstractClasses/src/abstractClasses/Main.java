package abstractClasses;

public class Main {

	public static void main(String[] args) {
		/*
		 * GameCalculator gameCalculator = new GameCalculator() {
		 * 
		 * @Override public void hesapla() { // TODO Auto-generated method stub
		 * 
		 * } };
		 */
		GameCalculator gameCalculator = new KidsGameCalculator();
		gameCalculator.hesapla();

	}

}
