
public class Manager extends Salaried{
	private double bonus;
	
	public Manager(String lastname, String firstname, double annualsalary, double bonus) {
		super(lastname, firstname, annualsalary);
		this.bonus = bonus;
	}
	
	public double weeklyPay(int hoursworked) {
		return (annualsalary / 52) + bonus;
	}
	
}
