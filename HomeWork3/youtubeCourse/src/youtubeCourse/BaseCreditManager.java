package youtubeCourse;

public abstract class BaseCreditManager implements ICreditManager {
	public abstract void calculate();// tamamlanmamýþ

	public void save() {// tamamlanmýþ
		System.out.println("Kaydedildi");
	}
}
