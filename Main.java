package org.hr_system;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

public class Main {
	 public static void main(String[] args) {
	       
	        Employee employee = new Employee("Surya", "Mani", 1, 70, 2500, 13, 70000, 5, "Sasikumar_M", "sasikumar2603");
	        SalesRep salesRep = new SalesRep("Dhinesh", "kumar", 2, 35, 3000, 15, 90000, 10, "Dhineh_Y", "dinav22", 100000);

	        SalesManager salesManager = new SalesManager("Aravind", "kumar", 3, 28, 1500, 10, 50000, 3, "Anish123", "blueed");

	       
	        salesManager.addSalesRep(salesRep);

	        System.out.println("Employee login: " + employee.login("Sasikumar_M", "sasikumar2603")); 
	        System.out.println("Employee Bonus: $" + employee.calculateBonus());
	        System.out.println("Time To Retirement :" + employee.timeToRetirement()); 
	        System.out.println("Vacation time Left :" + employee.vacationTimeLeft() +"\n");


	        System.out.println("SalesRep login: " + salesRep.login("Dhineh_Y", "dinav22")); 
	        System.out.println("SalesRep Bonus: $" + salesRep.calculateBonus());
	        System.out.println("Time To Retirement :" + salesRep.timeToRetirement());
	        System.out.println("Commision :" + salesRep.calculateCommission());
	        System.out.println("Vacation time Left :" + salesRep.vacationTimeLeft() +"\n");

	        System.out.println("SalesManager login: " + salesManager.login("Anish123", "blueed"));
	        System.out.println("SalesManager Bonus: $" + salesManager.calculateBonus());
	        System.out.println("Time To Retirement :" + salesManager.timeToRetirement());
	        System.out.println("Commision :" + salesManager.calculateCommission());
	        System.out.println("Vacation time Left :" +salesManager.vacationTimeLeft() +"\n");


	    }
	}