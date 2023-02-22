package Lecture3;
import java.util.*;

public class Pattern_Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner (System.in);
		int n = Sc.nextInt();
		int row =1;
		int star = n;
		while(row<=n) {
			int i =1;
			while(i<= star) {
				System.out.print("*");
				i++;
				
			}
			System.out.println();
			row++;
			
		}
		

	}

}
