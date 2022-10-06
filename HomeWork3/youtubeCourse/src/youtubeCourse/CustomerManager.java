package youtubeCourse;

public class CustomerManager {

	private Customer customer;
	private ICreditManager creditManager;

	public CustomerManager(Customer customer, ICreditManager creditManager) { // interfaces referans tiptir
		this.customer = customer;
		this.creditManager = creditManager;
	}

	public void save() {// M��teri nesnesini parametre olarak g�nderdik
		System.out.println("M��teri Kaydedildi");
	}

	public void delete() {// M��teri nesnesini parametre olarak g�nderdik
		System.out.println("M��teri Silindi");
	}

	public void giveCredit() {
		creditManager.calculate();
		System.out.println("Kredi Verildi");
	}
}
