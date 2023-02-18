package com.Arraysfor2;

public class NumArray {

	public static void main(String[] args) {
		int[] nums = {1,-2,-3,4,0,-6,5};
		int add = 0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>0) {
				add = add+nums[i];
				System.out.print(nums[i]+"+");
			}
		}
		System.out.println(" = "+add);

	}

}
