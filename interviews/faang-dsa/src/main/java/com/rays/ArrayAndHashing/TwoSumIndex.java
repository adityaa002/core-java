package com.rays.ArrayAndHashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumIndex {

	public static int[] twoSum(int[] num, int target) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < num.length; i++) {
			int complement = target - num[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(num[i], i);

		}

		return new int[] {};

	}

	public static void main(String[] args) {

		int[] num = { 2, 5, 4, 8, 9, 0, 1 };
		int target = 14;

		int[] result = twoSum(num, target);

		System.out.println(Arrays.toString(result));

	}
}
