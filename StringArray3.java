package com.Arraysfor2;

public class StringArray3 {

	public static void main(String[] args) {
		String[] names = {"petchi","nathan","tamil","j","j"};
		int max = 0;
		String temp = "";
		for(int i=0;i<names.length;i++) {
			if(names[i].length()>=max) {
				max = names[i].length();
				temp = names[i];
			}
		}
		System.out.println(temp);

	}

}
