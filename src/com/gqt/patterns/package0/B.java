package com.gqt.patterns.package0;
import java.util.Scanner;

class B {

	public static void main(String [] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		sc.close();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || (j==n/2 && i!=0 && i!=n/2 && i!=n-1) ||
				   (i==0 && j<n/2 ) ||
				   (i==n/2 && j<n/2) ||
				   (i==n-1 && j<n/2)) {
				System.out.print("# ");
					
				}
				else {
					
				}
			}
			System.out.println();
			
		}
	
	}

}
