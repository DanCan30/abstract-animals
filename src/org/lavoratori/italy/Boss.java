package org.lavoratori.italy;

public class Boss extends Person {
	
	private int salary;
	private int bonus;
	
	public Boss(String name, String surname, String dateOfBirth, int salary, int bonus) {
		super(name, surname, dateOfBirth);
		setSalary(salary);
		setBonus(bonus);
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return this.salary;
	}
	
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public int getBonus() {
		return this.bonus;
	}

	@Override
	public int getYearlyIncome() {
		return this.salary * 12 + this.bonus;
	}
	
	@Override
	public String toString() {
		return "Boss: \n" 
				+ super.toString() 
				+ "\nYearIncome: " + getYearlyIncome() + "€";
	}

}
