package com.Arraysfor2;

public class BulkArray {

	public static void main(String[] args)throws Exception {
		try {
		boolean[] check = {true,false,true,false};
		for(int i=0;i<check.length;i++) {
			System.out.println(check[i]);
		}
		}
		catch(Exception e) {
			System.out.println("array out of range");
		}

	}

}
