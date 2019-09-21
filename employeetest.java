import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] employees = new Employee[3];
		employees[0] = new Hourly("Morgan", "Harry", 30);
		employees[1] = new Salaried("Lin", "Sally", 52000);
		employees[2] = new Manager("Smith", "Mary", 104000, 50);
		System.out.println("How many hours has this employee worked?");
		Scanner s = new Scanner(System.in);
		int h;
		for ( Employee e : employees ) {
			System.out.println("Name:" + e.getName());
			h = s.nextInt();
			System.out.println("The weekly pay for this employee is " + e.weeklyPay(h));
		}
		
	}

}
