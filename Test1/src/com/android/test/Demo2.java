package com.android.test;

public class Demo2 {
		
	public static void main(String[] args) {
		int x1 = 1;
		int sum = 0;
		int n = 9;
		for (int i = 0; i <= n; i++) {
			x1 = func(i);
			sum = sum + x1;
		}
		System.out.print("x1 "+x1+"\n");
		System.out.print("sum "+sum);
	}
	public static int func(int x) {
		if(x>2){
			return (func(x-1)+func(x-2));
		}else{
			return 1;
		}
	}
	
}
