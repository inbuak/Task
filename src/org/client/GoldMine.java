package org.client;

import java.util.Scanner;

public class GoldMine{
	public  int max2(int x,int y) {
		if(x>=y) {
			return x;
		}
		else {
			return y;
		}
		
	}
	private int max3(int x,int y,int z) {
		if(x>=y && x>=y) {
			return x;
		}
		else if(y>=x && y>=z) {
			return y;
		}
		else {
			return z;
		}
		
	}
	public static void main(String[] args) {
		GoldMine ob=new GoldMine();
		int max = 0;
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		System.out.println("enter elements:");
		Scanner obj=new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			for (int j = 0;j<3; j++) {
				a[i][j]=obj.nextInt();
				}
			}

		for(int el[]:a) {
			for(int ele:el) {
				System.out.print(ele+" ");
			}
			System.out.println("");
		}
		for (int j = 2; j>=0; j--) {
			for (int i =2;i>=0; i--) {
				if(j==2) {
					b[i][j]=a[i][j];
				}
				else if(i==0) {
					b[i][j]=a[i][j]+ob.max2(b[i][j+1],b[i+1][j+1]);
				}
				else if(i==2) {
					b[i][j]=a[i][j]+ob.max2(b[i-1][j+1], b[i][j+1]);
				}
				else {
					b[i][j]=a[i][j]+ob.max3(b[i-1][j+1],b[i][j+1],b[i+1][j+1]);
				}
				
				}
			}
		for(int el[]:b) {
			for(int ele:el) {
				System.out.print(ele+" ");
			}
			System.out.println("");
		}
		for (int i = 0; i < 2; i++) {
				if(b[i+1][0]>=b[i][0]) {
					max=b[i+1][0];
				}
				else {
					max=b[i][0];
				}
			}
		System.out.println("max:"+max);
	}
}
