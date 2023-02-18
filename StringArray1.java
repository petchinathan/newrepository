package com.Arraysfor2;

public class StringArray1 {

	public static void main(String[] args) {
		String[] names = {"petchi","nathan","tamilan","jo","raj"};
		for(int i=0;i<names.length;i++) {
			if(names[i].length()>=5) {
				System.out.println(names[i]+" length "+names[i].length());
			}
		}
		

	}

}
