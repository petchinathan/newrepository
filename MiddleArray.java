package com.Arraysfor2;

public class MiddleArray {

	public static void main(String[] args) {
		String[] names = {"petchi","nathan","prasanth","raj"};
		for(int i=names.length/2;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		for(String a : names) {
			System.out.println(a);
		}

	}

}
