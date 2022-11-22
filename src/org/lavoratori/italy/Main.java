package org.lavoratori.italy;

public class Main {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("dipendente1", "cognome1", "1995/10/20", 1000, 13);
		Employee e2 = new Employee("dipendente2", "cognome2", "1998-08-30", 1200, 14);
		Employee e3 = new Employee("dipendente3", "cognome3", "2000-12-28", 600, 12);
		
		Boss ceo = new Boss("CEO", "cognome ceo", "1970/01/20", 5000, 20000);
		Boss ceosSon = new Boss("figlio del ceo", "cognome ceo", "2004/06-21", 3000, 1000);
		
		Person[] staff = {e1, e2, e3, ceo, ceosSon};
		
		int highestYearlyIncome = Integer.MIN_VALUE;
		int lowestYearlyIncome = Integer.MAX_VALUE;
		
		Person mostPaidPerson = null;
		Person leastPaidPerson = null;
		
		Boss mostPaidBoss = null;
		Employee leastPaidEmployee = null;
		
		int costSum = 0;
		
		for (int i = 0; i < staff.length; i++) {
			
			Person p = staff[i];
			
			System.out.println("-" + p.getYearlyIncome());
			
			costSum += p.getYearlyIncome();
			
			if(p.getYearlyIncome() > highestYearlyIncome) {
				highestYearlyIncome = p.getYearlyIncome();
				mostPaidPerson = p;
				
				if(mostPaidPerson instanceof Boss) {
					mostPaidBoss = (Boss) mostPaidPerson;
				}
				
			} else if (p.getYearlyIncome() < lowestYearlyIncome) {
				lowestYearlyIncome = p.getYearlyIncome();
				leastPaidPerson = p;

				if(leastPaidPerson instanceof Employee) {
					leastPaidEmployee = (Employee) leastPaidPerson;
				}
			}
		}
		
		double averageCost = costSum / staff.length;

		System.out.println("Most paid: " + mostPaidPerson);
		System.out.println("-----------------");
		System.out.println("Least paid: " + leastPaidPerson);
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
