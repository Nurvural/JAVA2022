
public class Main {

	public static void main(String[] args) {
		
		String[][] sehirler = new String[3][3]; // 0-1-2
		
		sehirler[0][0] = "�stanbul";
		sehirler[0][1] = "Konya";
		sehirler[0][2] = "Malatya";
		
		sehirler[1][0] = "�zmir";
		sehirler[1][1] = "Bursa";
		sehirler[1][2] = "Ankara";
		
		sehirler[2][0] = "Eski�ehir";
		sehirler[2][1] = "Sakarya";
		sehirler[2][2] = "Mu�la";
		
		for(int i=0; i<=2; i++) {
			System.out.println("------------");
			for(int j=0; j<=2; j++) {
				System.out.println(sehirler[i][j]);
			}
		}
	}

}
