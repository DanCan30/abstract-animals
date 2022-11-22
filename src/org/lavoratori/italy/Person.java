package org.lavoratori.italy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public abstract class Person {

	private String name;
	private String role;
	private LocalDate dateOfBirth;
	private String agencyCode;

	Random rand = new Random();
	DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d-M-Y");
	
	public abstract int getYearlyIncome();
	
	public Person(String name, String surname, String dateOfBirth) {
		setName(name);
		setSurname(surname);
		setDateOfBirth(dateOfBirth);
		setAgencyCode();
	}
	
	public void setName(String name) {
		this.name = name.substring(0,1).toUpperCase() + name.substring(1);
	}
	public String getName() {
		return this.name;
	}
	
	public void setSurname(String surname ) {
		this.role = surname.substring(0,1).toUpperCase() + surname.substring(1);
	}
	public String getSurname() {
		return this.role;
	}
	
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = LocalDate.parse(dateOfBirth.replace("/", "-"));
	}
	public LocalDate getDateOfBirth() {
		return this.dateOfBirth;
	}
	
	public void setAgencyCode() {
		this.agencyCode = "";
		
		for(int i = 0; i < 5; i++) {
			this.agencyCode += rand.nextInt(10);
		}
	}
	public String getAgencyCode() {
		return this.agencyCode;
	}
	
	public String getFullName() {
		return getSurname() + " " + getName() + " (" + getAgencyCode() + ")";
	}
	
	@Override
	public String toString() {
		return getFullName()
				+ "\nDateOfBirth: " + dateFormatter.format(getDateOfBirth());
	}
	
}
