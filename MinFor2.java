package com.Arraysfor2;

public class MinFor2 {

	public static void main(String[] args) {
		int[] nums = {1,89,64,77,39,66,2};
		int mini = nums[0];
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<mini) {
				mini = nums[i];
			}
		}
		System.out.println(mini);
	}

}
