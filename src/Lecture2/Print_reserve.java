package Lecture2;

import java.util.*;


public class Print_reserve {
	public static void main(String args[])
	{
		// input from user
		Scanner Sc = new Scanner (System.in);
		// input from user
		int N= Sc.nextInt();
		// add integer to print value horiz
		int Rev=0;
		
		
		// add integer value
		int Rm;
		
		
		
		// print number again and again
		
		while(N>0) {
		
		
		//too get the last number of digit

		Rm= N%10;
		
		// to get the value hozi
		Rev= Rev*10+Rm;
		
		// Too print Number again
		N =N/10;
		

		}
		System.out.println(Rev);

}
}