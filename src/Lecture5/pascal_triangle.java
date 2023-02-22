package Lecture5;

import java.util.Scanner;

public class pascal_triangle {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	 
	//Input
	    int n = sc.nextInt();
	    int row = 0;
	    int star = 1;
               
	    //loop
        while(row<n) {
	    	int i = 0;
	    	int val =1;
	    
	    	//loop
	    	while (i<star) {
	    		
	    	//Print
	    	System.out.print(val+" ");
	    		val = ((row-i)*(val)/(i+1));
	    		i++;
	    	
	        //print 	
	    	}System.out.println(" ");
	    	row++;
	    	star++;
	    	
	    }
	    
	    
	
				

	}

}
