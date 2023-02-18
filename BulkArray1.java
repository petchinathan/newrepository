package com.Arraysfor2;

public class BulkArray1 {

	public static void main(String[] args) {
		String[] names = {"petchi","nathan","prasanth","raj"};
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		
		for(int i=names.length-1;i>=0;i--) {
			System.out.println(names[i]);
		}

	}

}
