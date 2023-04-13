package ControlStatement;

import java.util.Scanner;

public class LuckyWinner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a%10==3 || a%10==8){
			System.out.println("Lucky Winner");
		}
		else{
			System.out.println("Not a Lucky Winner");
		}
		sc.close();
	}
      
}
