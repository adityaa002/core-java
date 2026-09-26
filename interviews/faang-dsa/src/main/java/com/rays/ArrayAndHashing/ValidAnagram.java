package com.rays.ArrayAndHashing;

import java.util.Arrays;
import java.util.HashSet;

public class ValidAnagram {

	public static boolean valid(int[] nums) {
		/*
		 * BruteForce Arrays.sort(nums);
		 *  for (int i = 1; i < nums.length; i++) { 
		 *  if
		 * (nums[i] == nums[i - 1]) { 
		 * System.out.println(true);
		 *  return true; 
		 *  }
		 *   }
		 * System.out.println(false);
		 * 
		 * return false;
		 */

		
		//More Optimized
		HashSet<Integer> set = new HashSet<Integer>();
		for (int a : nums) {
			if (set.contains(a) == true) {
				System.out.println(true);
				return true;
			}
			set.add(a);
		}
		System.out.println(false);
		return false;

	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5 };

		valid(nums);

	}
}
