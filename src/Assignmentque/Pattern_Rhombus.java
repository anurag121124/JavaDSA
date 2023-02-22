package Assignmentque;
import java.util.*;

public class Pattern_Rhombus {

	Scanner scan =new Scanner(System.in);
		int N =scan.nextInt();
		int nst=N;
		int nsp=N;
		int row = 1;
		while(row<=N&&N<=20)
		{
			if(row==1||row==N)
			{
			for(int csp=1;csp<=nsp;csp++)
			{
				System.out.print(" ");
			}
			for(int cst=1;cst<=nst;cst++)
			{
				System.out.print("*");
			}
			}
			else
			{
				for(int csp=1;csp<=nsp;csp++)
				{
					System.out.print(" ");
				}
				for(int cst=1;cst<=nst;cst++)
				{
					if(cst==1||cst==nst)
					{
					System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
		System.out.println();
		row++;
		nsp--;
		}
		

	}
	}




