package com.android.test;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Demo3 {

//	public static void main(String[] args) {
//		List<Integer> all = new LinkedList<Integer>();
//		for(int i = 1 ; i <= 100 ; i++){
//			all.add(i);
//		}
//		int i = 0;
//		for(int n = 0 ; n < 100; n++ ){
//			i = (i + 13) % all.size();
//			all.remove(i);
//		}
//		System.out.println(all.get(i));
//	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  
		  //接收用户输入，获得总人数N
		  System.out.println("请输入参与的总人数：");
		  int N=sc.nextInt();
		  
		  //接收用户输入，获得出列人员的编号M
		  System.out.println("请输入出列的人的编号：");
		  int M=sc.nextInt();
		  
		  //建立布尔型的数组，长度为总人数
		  Boolean rs[]=new Boolean[N];
		  
		  //初始化布尔型数组，初始值均为true
		  for(int i=0;i<N;i++){
		   rs[i]=true;
		   //System.out.println(rs[i]);
		  }
		  
		  int n=N;//剩余的人数
		  int m=0;//报数的编号
		  
		  
		  
		  while(n>1){
		   for(int j=0;j<N;j++){
		    if(rs[j]){
		     m++;
		     if(m==M){
		      m=0;
		      rs[j]=false;
		      n--;
		      //System.out.println(rs[j]);
		     }
		     
		    }
		    
		   }
		   
		  }
		  
		  //打印出最后留下来的人员的编号
		  for(int k=0;k<N;k++){ 
		   if(rs[k]){
		    System.out.println("最后留下的是第"+(k+1)+"号。");
		    break;
		    
		   }
		  }
		  
		 }
}
