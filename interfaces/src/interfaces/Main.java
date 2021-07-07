package interfaces;

public class Main {

	public static void main(String[] args) {
		
		
		Logger[] loggers = {new SmsLogger(),new EmailLogger(),new FileLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer engin = new Customer(1,"Engin","Demiroð");
		
		CustomerManager customerManager2 = new CustomerManager(loggers);
		Customer ugur = new Customer(2,"Uður","Atam");
		
		customerManager.add(engin);
		System.out.println("-------\n\n");
		customerManager.delete(ugur);
				
	}

}
