package com.oop.pojo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestantWinner {
	public static void main(String[] args) {
		List<Contestant> list = new ArrayList<>();
		list.add(new Contestant("aditya", "8989765435"));
		list.add(new Contestant("amit", "7789765435"));
		list.add(new Contestant("ajay", "9789765435"));

		list.stream().map(e -> (e.phoneNo + ":" + e.name)).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(2).forEach(e -> System.out.println(e));
	}
}
