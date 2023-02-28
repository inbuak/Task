package org.client;

import java.util.Scanner;

public class FloodFill {
	public int[][] floodFill(int b[][],int r,int c,int newValue) {
		if(b[r][c]==newValue) {
			return b;
		}
		fill(b,r,c,newValue,b[r][c]);
		return b;
	}
	public void fill(int c[][],int r1,int c1, int newValue, int oldValue) {
		if(r1<0||c1<0||r1>=c.length||c1>=c[0].length||oldValue!=c[r1][c1]) {
			return;
		}
		c[r1][c1]=newValue;
		fill(c, r1+1, c1, newValue, oldValue);
		fill(c, r1-1, c1, newValue, oldValue);
		fill(c, r1, c1+1, newValue, oldValue);
		fill(c, r1, c1-1, newValue, oldValue);
	}
	public static void main(String[] args) {
		FloodFill ob=new FloodFill();
		int a[][]=new int[4][4];
		System.out.println("enter elements:");
		Scanner obj=new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			for (int j = 0;j<4; j++) {
				a[i][j]=obj.nextInt();
				}
			}
		for(int el[]:a) {
			for(int ele:el) {
				System.out.print(ele+" ");
			}
			System.out.println("");
		}
		System.out.println("enter row index  : ");
		int m=obj.nextInt();
		System.out.println("enter column index  : ");
		int n=obj.nextInt();
		System.out.println("enter new value  : ");
		int newnum= obj.nextInt();
		int[][] floodFill = ob.floodFill(a, m, n, newnum);
		for(int el[]:floodFill) {
			for(int ele:el) {
				System.out.print(ele+" ");
			}
			System.out.println("");
		}
		}
	}
