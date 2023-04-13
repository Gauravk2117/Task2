package ControlStatement;

import java.util.Scanner;

public class AayushScholarship {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		int g = (a+b+c+d+e)/5;
		sc.close();
		
		if(g>=4){
			if(a!=2 && b!=2 && c!=2 && d!=2 && e!=2){
				if(a==5 || b==5 || c==5 || d==5 || e==5){
					System.out.println("Yes");
				}
				else{
					System.out.println("No");
				}
				
			}
			else{
				System.out.println("No");
			}
		}
		else{
			System.out.println("No");
		}
		
	}

}
