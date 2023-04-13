package ControlStatement;

import java.util.Scanner;

public class MinimumMaximum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A>B){
		
			System.out.println(A+" "+(A+B));
		}
		else{
			System.out.println(B+" "+(A+B));
		}
		sc.close();
 
	}

}
