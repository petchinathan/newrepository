package com.Arraysfor2;

public class EndsArray {

	public static void main(String[] args) {
		String[] names = {"petchi","nathan","prasanth","raj"};
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i].endsWith("p"));
		}
		
		for(int i=0;i<names.length;i++) {
			if(names[i].endsWith("n")) {
				System.out.println(names[i]);
			}
		}

	}

}
