package youtubeCourse;

public class CustomerManager {

	private Customer customer;
	private ICreditManager creditManager;

	public CustomerManager(Customer customer, ICreditManager creditManager) { // interfaces referans tiptir
		this.customer = customer;
		this.creditManager = creditManager;
	}

	public void save() {// Müşteri nesnesini parametre olarak gönderdik
		System.out.println("Müşteri Kaydedildi");
	}

	public void delete() {// Müşteri nesnesini parametre olarak gönderdik
		System.out.println("Müşteri Silindi");
	}

	public void giveCredit() {
		creditManager.calculate();
		System.out.println("Kredi Verildi");
	}
}
