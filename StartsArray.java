package com.Arraysfor2;

public class StartsArray {

	public static void main(String[] args) {
		String[] names = {"petchi","nathan","prasanth","raj"};
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i].startsWith("p"));
		}
		
		
		for(int i=0;i<names.length;i++) {
			if(names[i].startsWith("p")) {
				System.out.println(names[i]);
			}
		}
	}

}
