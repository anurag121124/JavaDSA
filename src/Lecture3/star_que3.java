package Lecture3;

import java.util.*;

public class star_que3 {

public static void main(String[] args) {
// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		int star = n;
		int row = 1;
		int space = 0;
		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			space++;
			star--;
			row++;

		}

	}
}
