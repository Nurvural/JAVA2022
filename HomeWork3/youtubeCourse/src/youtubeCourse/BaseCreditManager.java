package youtubeCourse;

public abstract class BaseCreditManager implements ICreditManager {
	public abstract void calculate();// tamamlanmam��

	public void save() {// tamamlanm��
		System.out.println("Kaydedildi");
	}
}
