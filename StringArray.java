package com.Arraysfor2;

public class StringArray {

	public static void main(String[] args) {
		String[] names = {"PETCHI","NATHAN","raj","jo","tamilan"};
		int count = 0;
		for(int i =0;i<names.length;i++) {
			if(names[i].equals(names[i].toUpperCase())) {
				System.out.println(names[i]);
				count++;
			}
		}
		System.out.println("total upperCase "+count++);
	}

}
