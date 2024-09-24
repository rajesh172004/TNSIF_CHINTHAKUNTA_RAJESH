package T030304339_Chinthakunta_RajeshAssignment_1.utilities;

import T030304339_Chinthakunta_RajeshAssignment_1.employees.Employee;

public class EmployeeUtilities {
	public static void displayinfo(Employee employee) {
		System.out.println("Employee Name "+employee.getName());
		System.out.println("Employee ID "+employee.getEmployeeId());
		System.out.println("Employee Salary "+employee.getSalary());
	}

	public static void bonus(Employee employee, double amount) {
		amount = employee.getSalary() * (8.33/100);
		double newSalary = employee.getSalary()+amount;
		employee.setSalary(newSalary);
		System.out.println(employee.getName()+" getbonus "+newSalary);
}
}
