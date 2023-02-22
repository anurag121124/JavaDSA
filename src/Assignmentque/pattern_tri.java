package Assignmentque;
import java.util.*;

public class pattern_tri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nst=1;
			int nsp=n-1;
			int val=1;
			int row=1;
			while(row<=n){
				//space
				for(int csp=1;csp<=n;csp++){
					System.out.print("\t");
				}
				for(int cst=1;cst<=nst;cst++)
				{
					System.out.print(val+"\t");
					val++;
				}
				int cst=1;
				if(cst<=nst/2)
				val++;
				else
				val--;
			}
			System.out.println();
			nsp--;
			nst+=2;
			row++;
			}
		



	}


