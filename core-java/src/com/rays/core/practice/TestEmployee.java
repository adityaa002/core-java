package com.rays.core.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {

		List emp = new ArrayList();

		emp.add(new Employees(101, "Aditya", "amdocs", 650000));
		emp.add(new Employees(102, "Carl", "Tcs", 40000));
		emp.add(new Employees(103, "Michel", "Microsoft", 98000));
		emp.add(new Employees(104, "John", "amazon", 30880));
		emp.add(new Employees(105, "Thor", "amdocs", 2000000));
		emp.add(new Employees(106, "Tony", "star Industries", 760000));
		emp.add(new Employees(107, "Azookie", "Ncs", 890000));
		emp.add(new Employees(108, "Desmine", "ITC", 2300000));

		Collections.sort(emp, new Duplicacyy());

		for (Object object : emp) {
			System.out.println(object);

		}

	}

}
