package org.hr_system;

public  class Employee implements User {

	  String firstName;
	  String lastName;
	  int registration;
	  int age;
	  int daysWorked;
	  int vacationDaysTaken;
	  double salary;
	  int yearsWorked;
	  private String username;
	  private String password;


	public Employee(String startName, String endName, int endroll, int age, int workedDays, int vacationTaken, double amount,  int experience, String userName, String passWord ) {
		  this.firstName = startName;
		  this.lastName = endName;
		  this.registration = endroll;
		  this.age = age;
		  this.daysWorked = workedDays;
		  this.vacationDaysTaken = vacationTaken;
		  this.salary = amount;
		  this.yearsWorked = experience;
		  this.username = userName;
		  this.password = passWord;

	}
	public int timeToRetirement(){

		int workingYear = Math.min(60 - age , 40 - yearsWorked);
		return workingYear;
	   }
	public int vacationTimeLeft() {
		int remineTime = (daysWorked / 360) * (30 - vacationDaysTaken);
        return remineTime;
    }

    public int calculateBonus() {
    	int bonous = (int) (2.2 * salary);
        return bonous;
    }
    public String login(String enteredUsername, String enteredPassword) {
        if(this.username.equals(enteredUsername) && this.password.equals(enteredPassword)) {
        	return "Login Successfully";
        }
        else {
        return "Invalid username or Pessword";
    }

}
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
}