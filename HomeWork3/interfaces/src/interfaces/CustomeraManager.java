package interfaces;

public class CustomeraManager {
	private ICustomerDal customerDal;

	public CustomeraManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {
		// i� kodlar�
		customerDal.Add();
	}
}
