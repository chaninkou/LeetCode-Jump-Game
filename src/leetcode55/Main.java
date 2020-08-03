package leetcode55;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {3,1,1,1,0};
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		CheckIfFirstRearchEndFunction solution = new CheckIfFirstRearchEndFunction();
		
		System.out.println("Can Index 1 reach to last index?: " + solution.canJump(nums));
	}
}
