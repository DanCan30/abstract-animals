package org.lavoratori.italy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public abstract class Person {

	private String name;
	private String surname;
	private LocalDate dateOfBirth;
	private String agencyCode;

	Random rand = new Random();
	DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d-M-Y");
	
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
		this.surname = surname.substring(0,1).toUpperCase() + surname.substring(1);
	}
	public String getSurname() {
		return this.surname;
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
	
	public abstract int getYearlyIncome();
	
	@Override
	public String toString() {
		return getFullName()
				+ "\nDateOfBirth: " + dateFormatter.format(getDateOfBirth());
	}
	
}
