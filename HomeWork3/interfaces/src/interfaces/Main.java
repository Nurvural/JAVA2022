package interfaces;

public class Main {

	public static void main(String[] args) {
		// ICustomerDal customerDal = new OracleCustomerDal();
		CustomeraManager customeraManager = new CustomeraManager(new OracleCustomerDal());
		// customeraManager.customerDal = new MySqlCustomerDal();
		customeraManager.add();

	}

}
