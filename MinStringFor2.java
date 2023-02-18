package com.Arraysfor2;

public class MinStringFor2 {

	public static void main(String[] args) {
		String[] names = {"petchi","nathan","tamil","j","j"};
		int min = names[0].length();
		String temp = "";
		for(int i=0;i<names.length;i++) {
			if(names[i].length()<min) {
				min = names[i].length();
				temp = names[i];
			}
		}
		System.out.println();
		
	}

}
