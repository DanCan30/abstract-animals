package org.lavoratori.italy;

public class Main {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("dipendente1", "opeario", "1995/10/20", 1000, 13);
		Employee e2 = new Employee("dipendente2", "macchinista", "1998-08-30", 1200, 14);
		Employee e3 = new Employee("dipendente3", "stagista", "2000-12-28", 600, 12);
		
		Boss ceo = new Boss("boss1", "CEO", "1970/01/20", 5000, 20000);
		Boss ceosSon = new Boss("boss2", "figlio del ceo", "2004/06-21", 3000, 10000);
		
		Person[] staff = {ceosSon, e1, e2, ceo, e3};
		
		int highestYearlyIncome = Integer.MIN_VALUE;
		int lowestYearlyIncome = Integer.MAX_VALUE;
		
		Person mostPaidPerson = null;
		Person leastPaidPerson = null;
		
		Boss mostPaidBoss = null;
		int mostPaidBossIncome = Integer.MIN_VALUE;
		
		Employee leastPaidEmployee = null;
		int leastPaidEmployeeIncome = Integer.MAX_VALUE;
		
		int costSum = 0;
		
		for (int i = 0; i < staff.length; i++) {
			
			Person p = staff[i];
			
			costSum += p.getYearlyIncome();
			
			if(p.getYearlyIncome() > highestYearlyIncome) {
				
				highestYearlyIncome = p.getYearlyIncome();
				mostPaidPerson = p;
			} else if (p.getYearlyIncome() < lowestYearlyIncome) {
				
				lowestYearlyIncome = p.getYearlyIncome();
				leastPaidPerson = p;
			}
			
			if(p instanceof Boss) {
				
				Boss b = (Boss) p;
				
				if(b.getYearlyIncome() > mostPaidBossIncome) {
					mostPaidBossIncome = b.getYearlyIncome();
					mostPaidBoss = b;
				}
			} else if (p instanceof Employee) {
				
				Employee e = (Employee) p;
				
				if(e.getYearlyIncome() < leastPaidEmployeeIncome) {
					leastPaidEmployeeIncome = e.getYearlyIncome();
					leastPaidEmployee = e;
				}
			}
		}
		
		double averageCost = costSum / staff.length;

		System.out.println("Most paid: \n" + mostPaidPerson);
		System.out.println("-----------------");
		System.out.println("Least paid: \n" + leastPaidPerson);
		System.out.println("-----------------");
		System.out.println("Total cost per year: " + costSum + "€");
		System.out.println("-----------------");
		System.out.println("Average yearly cost for staff member: " + averageCost + "€");
		System.out.println("-----------------");
		System.out.println("The most paid boss is: " + mostPaidBoss.getFullName() );
		System.out.println("-----------------");
		System.out.println("The least paid employee is: " + leastPaidEmployee.getFullName() );
	}
}
