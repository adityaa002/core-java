package com.rays.core.oopExercise;

public class TestEmployee {
	public static void main(String[] args) throws CloneNotSupportedException {
		Department dpt1 = new Department("Aditya", 5467, "Developer");
		Address add1 = new Address("Harda bypass , Hoshangabad [Dist. Hoshangabad ,MadhyaPradesh]",
				"Jaora Compound , Indore , MadhyaPradesh");
		Employee emp1 = new Employee(dpt1, add1);

		Employee emp2 = (Employee) emp1;
		emp2.address.localAddress = ("Geeta bhawan , AB Road , indore , Madhyapradesh");

		System.out.println(emp1.department.employeeName);
		System.out.println(emp1.department.employeeId);
		System.out.println(emp1.department.employeeDesignation);
		System.out.println(emp1.address.localAddress);
		System.out.println(emp1.address.permanentAddress);

	}

}
