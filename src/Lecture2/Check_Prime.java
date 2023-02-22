package Lecture2;
import java.util.*;

public class Check_Prime {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner ( System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
	    System.out.println(n);
	    System.out.println(a);*/
	
	    public static void main(String[] args) {
			try (// TODO Auto-generated method stub
			Scanner sc = new Scanner ( System.in)) {
				int n = sc.nextInt();
				int i =2;
				int fact = 0;
				
				while (i<n) {
					if(n % i == 0) {
						fact++;
						}
					i++;
					if (fact==1) {
if (fact >=1)
						
						System.out.println("Not Prime");
					}else {
						
						System.out.println("Prime");
					}
						
					}
			}
			}
}