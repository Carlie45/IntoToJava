package com.edynamix.learning.intro_to_java.chapter5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task7_FindAllSubsetsWithNullSum {

	// As the method's name suggests - it finds all subsets of a given set.
	private static Set<Set<Integer>> findAllSubsets(int[] set) {
		int setLength = set.length;
		int n = (int) Math.pow(2, setLength); // all subsets' count is
												// 2^setLength.
		Set<Set<Integer>> allSubsets = new HashSet<>();
		for (int i = 1; i < n; i++) {
			Set<Integer> subset = new HashSet<>();

			String numberInBinary = Integer.toBinaryString(i);
			int[] representation = getBinaryRepresentation(numberInBinary, setLength);

			for (int j = 0; j < representation.length; j++) {
				if (representation[j] == 1) {
					subset.add(set[j]);
				}
			}

			allSubsets.add(subset);
		}

		return allSubsets;
	}

	// Adds zeros at the beginning until the length is equal to setLength.
	private static int[] getBinaryRepresentation(String numberInBinary, int setLength) {
		int[] representation = new int[setLength];
		int lengthOfNumber = numberInBinary.length();
		for (int i = setLength - 1; i >= 0 && lengthOfNumber > 0; i--) {
			representation[i] = numberInBinary.charAt(lengthOfNumber - 1) == '1' ? 1 : 0;
			lengthOfNumber--;
		}

		return representation;
	}

	public static void main(String[] args) {
		// The guidance of the task suggests using if-constructions, but the
		// count of the numbers in the set is not mentioned,
		// so I am going for a more generic solution.
		int[] set = new int[] { 1, 5, -1, -5, -2, 3 };
		Set<Set<Integer>> allSubsets = findAllSubsets(set);
		for (Set<Integer> currentSubset : allSubsets) {
			int sum = 0;
			for (Integer elem : currentSubset) {
				sum += elem;
			}
			if (sum == 0) {
				System.out.println(Arrays.toString(currentSubset.toArray()));
			}
		}
	}
}
