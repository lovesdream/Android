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
		  
		  //�����û����룬���������N
		  System.out.println("������������������");
		  int N=sc.nextInt();
		  
		  //�����û����룬��ó�����Ա�ı��M
		  System.out.println("��������е��˵ı�ţ�");
		  int M=sc.nextInt();
		  
		  //���������͵����飬����Ϊ������
		  Boolean rs[]=new Boolean[N];
		  
		  //��ʼ�����������飬��ʼֵ��Ϊtrue
		  for(int i=0;i<N;i++){
		   rs[i]=true;
		   //System.out.println(rs[i]);
		  }
		  
		  int n=N;//ʣ�������
		  int m=0;//�����ı��
		  
		  
		  
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
		  
		  //��ӡ���������������Ա�ı��
		  for(int k=0;k<N;k++){ 
		   if(rs[k]){
		    System.out.println("������µ��ǵ�"+(k+1)+"�š�");
		    break;
		    
		   }
		  }
		  
		 }
}
