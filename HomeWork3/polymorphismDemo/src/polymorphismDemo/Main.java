package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		/*
		 * BaseLogger[] loggers = new BaseLogger[] { new DatabaseLogger(), new
		 * EmailLogger(), new FileLogger(), new ConsoleLogger()}; for (BaseLogger logger
		 * : loggers) { logger.log("Log mesajý"); }
		 */
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

}
