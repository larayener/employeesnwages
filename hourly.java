public class Hourly extends Employee {
	private double wage;
	
	public Hourly(String lastname, String firstname, double wage) {
		super(lastname, firstname);
		this.wage = wage;
	}
	
	public double weeklyPay(int hoursworked) {
		double weeklypay;
		if (hoursworked <= 40) {
			weeklypay = hoursworked * wage;
		}
		else {
			weeklypay = (wage * 40) + (hoursworked - 40)*(wage * 1.5);
		}
		return weeklypay;
	}
	
}
