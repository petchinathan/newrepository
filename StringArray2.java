package com.Arraysfor2;

public class StringArray2 {

	public static void main(String[] args) {
		String[] names = {"petchi","nathan","tamilan","j","j"};
		int count = 0;
		int count1 = 0;
		for(int i=0;i<names.length;i++) {
			if(names[i].contains("a") || names[i].contains("e") || names[i].contains("i") || names[i].contains("o") || names[i].contains("u")) {
				count++;
			}
			else 
				count1++;
		}
		System.out.println(count1);

	}

}
