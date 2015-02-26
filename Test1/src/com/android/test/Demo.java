package com.android.test;

public class Demo {
		
	public static void main(String[] args) {
		int[] a = {20,16,48,59,7,33,89};
		int max = 0;
		int tmp = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.println(i+"'''");
			for (int j = i+1; j < a.length; j++) {
				if(a[max]<a[j])
					max = j;
				System.out.println(max+"===");
			}
			if(i!=max){
				tmp = a[i];
				a[i] = a[max];
				a[max] = tmp;
				System.out.println(a[max]+"+++");
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"---");
		}
	}
}
