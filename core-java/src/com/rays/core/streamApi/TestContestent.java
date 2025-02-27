package com.rays.core.streamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestent {
	public static void main(String[] args) {
		List<Contestent> list = new ArrayList();
		list.add(new Contestent("Aditya", "7828568475"));
		list.add(new Contestent("Vinay", "8875459654"));
		list.add(new Contestent("Yusuf", "7645854652"));
		list.add(new Contestent("umakant", "98878787877"));
		list.add(new Contestent("satyam", "9899787877"));
		list.add(new Contestent("rahul", "9887878787"));
		list.add(new Contestent("gorav", "9887878177"));
		list.add(new Contestent("shubham", "9800787877"));
		list.add(new Contestent("riya", "7270787877"));
		list.add(new Contestent("abc", "988877"));
		list.add(new Contestent("deepak", "9900787877"));
		list.add(new Contestent("ankita", "8811787877"));
		list.add(new Contestent("varun", "9112787877"));
		list.add(new Contestent("mohit", "9887787877"));
		list.add(new Contestent("priya", "9876509876"));
		list.add(new Contestent("ajay", "9856781234"));
		list.add(new Contestent("sneha", "8989787877"));
		list.add(new Contestent("amit", "9878909876"));
		list.add(new Contestent("kavya", "9765478901"));
		list.add(new Contestent("manish", "9988776655"));
		list.add(new Contestent("akash", "8899001122"));
		list.add(new Contestent("umesh", "9887878787"));
		list.add(new Contestent("xyz", "11878787877"));
		list.add(new Contestent("rani", "7270787877"));
		list.add(new Contestent("nilesh", "8765467890"));
		list.add(new Contestent("nidhi", "7766554433"));
		list.add(new Contestent("piyush", "9800123456"));
		list.add(new Contestent("vishal", "9786453123"));
		list.add(new Contestent("sakshi", "9900112233"));

		Collections.sort(list);
		for (Contestent contestent : list) {
			System.out.println(contestent);

		}
		System.out.println();

		System.out.println("Sorted 4 Winners are : - ");

		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(4).forEach(e -> {

					System.out.println(e);
				});

	}
}