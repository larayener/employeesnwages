
public abstract class Employee {
	private String lastname;
	private String firstname;
	
	public Employee(String lastname, String firstname) {
		this.lastname = lastname;
		this.firstname = firstname;
	}
	
	public abstract double weeklyPay(int hoursworked);
	
	public String getName() {
		return firstname + " " + lastname;
	}
	
}
