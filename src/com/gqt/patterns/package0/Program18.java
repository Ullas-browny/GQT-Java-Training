package com.gqt.patterns.package0;

import java.util.Scanner;

public class Program18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the value of n : ");
		int n= sc.nextInt();
		sc.close();
		
		for(int i=n;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print("&"+" ");
			}
			for(int j=0;j<4;j++) {
				System.out.print("#"+" ");
			}
			for(int j=n;j>=i;j--) {
				System.out.print("@"+" ");
			}
			System.out.println();
		}
		
	}

}
