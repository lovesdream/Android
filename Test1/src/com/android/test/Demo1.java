package com.android.test;

public class Demo1 {
	
	public static void main(String[] args,int[] targearr) {
		int[] arr = new int[]{7,1,90,58,40,21,88,65};
		int temp = 0;
		for (int i = 0; i < targearr.length; i++) {
			for (int j = i; j < targearr.length; j++) {
				if(targearr[i]>targearr[j]){
					temp = targearr[i];
					targearr[i] = targearr[j];
					targearr[j] = temp;
				}
			}
		}
		for(int i : arr) 
			System.out.print(i+",");
	}
}
