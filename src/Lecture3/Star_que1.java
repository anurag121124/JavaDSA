package Lecture3;
import java.util.*;

public class Star_que1 {
	public static void main(String args[]) {
	Scanner Sc = new Scanner (System.in);
	int n = Sc.nextInt();
	int row = 1;
	int star = 1;
	while (row<=n) {
		int i=1;
		while (i<= star) {
		System.out.print("*");
		i++;
		
	}
	
	//next row
	System.out.println();
	row++;
	star++;
	
	}
	
	
	}	

}
