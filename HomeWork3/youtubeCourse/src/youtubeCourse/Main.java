package youtubeCourse;

public class Main {

	public static void main(String[] args) {

		CreditManager creditManager = new CreditManager();
		creditManager.calculate();

		Customer customer = new Customer();// instance oluşturmak
		customer.id = 1;
		customer.sehir = "Konya";
		// IoC Container
		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.delete();
		customerManager.save();
		customerManager.giveCredit();

		Company company = new Company();
		company.taxNumber = "100000";
		company.companyName = "Arçelik";
		company.id = 2;

		// CustomerManager customerManager2 = new CustomerManager(new Person());
		Person person = new Person();

	}

}
