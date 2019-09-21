
public class Salaried extends Employee {
	protected double annualsalary;
	
	public Salaried(String lastname, String firstname, double salary) {
		super(lastname, firstname);
		annualsalary = salary;
	}
	
	public double weeklyPay(int hoursworked) {
		return annualsalary / 52;
	}

}
