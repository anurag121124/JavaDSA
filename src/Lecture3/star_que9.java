package Lecture3;
import java.util.*;
public class star_que9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner Sc = new Scanner (System.in);
    int n = Sc.nextInt();
    int star = 1;
	int row = 1;
	int space = n-1;
	while (row <= n) {
		int i = 1;
		while(i<space) {
		System.out.print(" ");
		i++;
	}
int j = 1;
while(j<=star) {
	System.out.print("* ");
	j++;
	
}
   System.out.println();
    space = space -1;
    star = star +2;
    row++;
  
    
	}

}
}