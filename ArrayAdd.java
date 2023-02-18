package com.Arraysfor2;

public class ArrayAdd {

	public static void main(String[] args) {
		int[] nums = {24,55,44,33,55,33};
		int add = 0;
		int add1 = 0;
		for(int i=0;i<nums.length;i++) {
			add = add+nums[i];
		}
		
		for(Integer sum : nums) {
			add1 = add1+sum;
		}
		
		
		System.out.println(add);
		System.out.println(add1);
		}

}
