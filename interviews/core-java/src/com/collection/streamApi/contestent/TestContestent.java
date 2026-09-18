package com.collection.streamApi.contestent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestent {
	public static void main(String[] args) {

		List<ContestentWinner> list = new ArrayList<ContestentWinner>();

		list.add(new ContestentWinner("aditya", "7828758458"));
		list.add(new ContestentWinner("amit", "9858748754"));
		list.add(new ContestentWinner("vedik", "7695213250"));
		list.add(new ContestentWinner("chetan", "8210269874"));
		list.add(new ContestentWinner("yusuf", "7098570635"));

		list.stream().map(e -> (e.getName() + " " + e.getPhone())).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), c -> {
					Collections.shuffle(c);
					return c.stream();
				})).limit(2).forEach(e -> System.out.println(e));
	}

}
