package Assignmentque;

import java.util.Scanner;

public class Sum_even_digit_placed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int pos = 1;
		int sumeven =0;
		int sumodd=0;
		while(n>0) {
			int rem =n%10;
			
			if(pos%2!=0)
			{
				sumodd = sumodd+rem;}
				
			else {
				
			
			
			sumeven=sumeven+rem;	}
			pos++;
			}

		System.out.println(sumeven);
		System.out.println(sumodd);
		}
	

	}


