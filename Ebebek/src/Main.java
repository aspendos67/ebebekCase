
public class Main {

	public static void main(String[] args) {

		Employee employee = new Employee("Erkut", 2000, 41, 2010);

		System.out.println(employee);
		System.out.println("Vergi:" + employee.tax() + " " + "Bonus:" + employee.bonus() + " " + "Maaş Artışı:"
				+ employee.riseSalary() + " " + "Nihai Maaş:" + (employee.salary + employee.riseSalary()) + " "
				+ "Maaş ve Nihai maaş:" + employee.salary + ", " + (employee.salary + employee.riseSalary()));
	}

}
