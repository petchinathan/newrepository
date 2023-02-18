package com.Arraysfor2;

public class MaxFor2 {

	public static void main(String[] args) {
		int[] nums = {15,20,55,500,400,50};
		int max = 0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max) {
				max = nums[i];
			}
		}
		System.out.println(max);

	}

}
