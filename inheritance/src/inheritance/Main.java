package inheritance;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee =new Employee();
		
		customer.age=18;
		employee.firstName="Ahmet";
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		
		employeeManager.Add();
		customerManager.List();
	}

}
