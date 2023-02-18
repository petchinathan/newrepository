package com.Arraysfor2;

public class StringExFor2 {

	public static void main(String[] args) {
		System.out.println("Second half forwarding");
		String[] names = {"petchi","nathan","tamil","jo","raj","kumar"};
		for(int i=names.length/2;i<names.length;i++) {
			System.out.println(names[i]);
		}
		System.out.println("------------------------");
		System.out.println("First half forwarding");
		for(int i=0;i<names.length/2;i++) {
			System.out.println(names[i]);
		}

		System.out.println("-----------------");
		System.out.println("Second half reverse");
		for(int i=names.length-1;i>=names.length/2;i--) {
			System.out.println(names[i]);
		}
		
		
		System.out.println("--------------------");
		System.out.println("First half Reverse");
		for(int i=names.length/2-1;i>=0;i--) {
			System.out.println(names[i]);
		}
	}

}