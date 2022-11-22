package org.lavoratori.italy;

public class Employee extends Person {

	private int salary;
	private int monthlyCount;
	
	public Employee(String name, String surname, String dateOfBirth, int salary, int monthlyCount) {
		super(name, surname, dateOfBirth);
		setSalary(salary);
		setMonthlyCount(monthlyCount);
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return this.salary;
	}
	
	public void setMonthlyCount(int monthlyCount) {
		this.monthlyCount = monthlyCount;
	}
	public int getMonthlyCount() {
		return this.monthlyCount;
	}
	
	@Override
	public int getYearlyIncome() {
		
		return this.salary * monthlyCount;
	}
	
	@Override
	public String toString() {
		return "Employee: \n" 
				+ super.toString() 
				+ "\nYearlyIncome: " + getYearlyIncome() + "€";
	}
}
