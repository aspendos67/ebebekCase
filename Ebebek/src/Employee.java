
public class Employee {

	String name;
	int salary;
	int workHours;
	int hireYear;

	public Employee(String name, int salary, int workHours, int hireYear) {

		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public int tax() {  // Bonus eklenmemiş vergi.
		int Tax = 0;
		if (this.salary <= 1000) {
			Tax = 0;
		}
		if (this.salary > 1000) {
			Tax = this.salary * 3 / 100;
		}
		return Tax;

	}

	public int bonus() {
		int Bonus = 0;
		if (this.workHours < 40) {
			Bonus = 0;
		}
		if (this.workHours >= 40) {
			Bonus = (this.workHours - 40) * 30 * 54 / 12; // 1 maaştaki bonus miktarı.
		}
		return Bonus;
	}

	public int riseSalary() {
		int RiseSalary = 0;
		if (2021 - this.hireYear < 10) {
			if (this.salary + bonus() > 1000) {
				RiseSalary = (this.salary + bonus()) * 105 / 100 * 97 / 100 - this.salary;	// Vergi maaş ve bonusun toplamından hesaplandı. 
																							// Maaşın vergilendirilmiş hali.
			} else {
				RiseSalary = (this.salary + bonus()) * 105 / 100 - this.salary;
			}
		}
		if (9 < 2021 - this.hireYear && 2021 - this.hireYear < 20) {
			if (this.salary + bonus() > 1000) {
				RiseSalary = (this.salary + bonus()) * 110 / 100 * 97 / 100 - this.salary;
			} else {
				RiseSalary = (this.salary + bonus()) * 110 / 100 - this.salary;
			}
		}
		if (2021 - this.hireYear > 19) {
			if (this.salary + bonus() > 1000) {
				RiseSalary = (this.salary + bonus()) * 115 / 100 * 97 / 100 - this.salary;
			} else {
				RiseSalary = (this.salary + bonus()) * 115 / 100 - this.salary;
			}
		}
		return RiseSalary;

	}

	@Override
	public String toString() {
		return "Çalışanın Adı:" + this.name + " " + "Çalışanın Maaşı:" + this.salary + " " + "Çalışma Saati:"
				+ this.workHours + " " + "Başlama Yılı:" + this.hireYear;
	}

}
