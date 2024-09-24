package T030304339_Chinthakunta_RajeshAssignment_1;

import T030304339_Chinthakunta_RajeshAssignment_1.employees.Developer;
import T030304339_Chinthakunta_RajeshAssignment_1.employees.Manager;
import T030304339_Chinthakunta_RajeshAssignment_1.utilities.EmployeeUtilities;

public class AssignmentMain {
	public static void main(String[] args) {
		Manager manager = new Manager("shiva", 21, 35000, "CSBS");
		Developer developer = new Developer("sai",22, 40000, "java");
		
		EmployeeUtilities.displayinfo(developer);
		EmployeeUtilities.displayinfo(manager);
		
		EmployeeUtilities.bonus(developer, 7);
		EmployeeUtilities.bonus(developer, 10);
		
		EmployeeUtilities.bonus(manager, 6);
		EmployeeUtilities.bonus(manager, 23);
	}
}
