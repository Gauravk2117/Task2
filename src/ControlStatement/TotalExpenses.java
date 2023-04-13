package ControlStatement;

import java.util.Scanner;

public class TotalExpenses {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		
		int numberOfTickets = sc.nextInt();
		double Total  ;
		double TotalExpenses;
		
		if(numberOfTickets<50){
			Total=X*numberOfTickets;
			System.out.println(Total);
		}
		else if(numberOfTickets>=50 && numberOfTickets<=100){
			TotalExpenses=X*numberOfTickets-(X*numberOfTickets*10)/100;
			System.out.println(TotalExpenses);
		}
		else if(numberOfTickets>=101 && numberOfTickets<=200){
			TotalExpenses=X*numberOfTickets-(X*numberOfTickets*20/100);
			System.out.println(TotalExpenses);
	}
		else if(numberOfTickets>=201 && numberOfTickets<=400){
			TotalExpenses=X*numberOfTickets-(X*numberOfTickets*30)/100;
			System.out.println(TotalExpenses);
		}
		else if(numberOfTickets>=401 && numberOfTickets<=500){
			TotalExpenses=X*numberOfTickets-(X*numberOfTickets*40/100);
			System.out.println(TotalExpenses);
		}
		else {
			TotalExpenses=X*numberOfTickets-(X*numberOfTickets*50/100);
			System.out.println(TotalExpenses);
		}
		sc.close();
}
}