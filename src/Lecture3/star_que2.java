package Lecture3;

import java.util.Scanner;

public class star_que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner (System.in);
		int n = Sc.nextInt();
		int row = 1;
		int star = n;
		while (row<=n) {
			int i=1;
			while (i<= star) {
			System.out.print("*");
			i++;
			
		}
		
		//next row
		System.out.println();
		row++;
		star--;
		
		}
		
		
		}	

	}




