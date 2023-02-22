package Lecture8;

import java.util.Scanner;

public class userinputarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int arr[]= new int[n]; // C type array
		
		int arr [] = new int[n]; // java array 
	        for (int i = 0; i < arr.length; i++) {
	        	arr[i]=sc.nextInt();
	        }
	        Display (arr);
	} 
	
	public static void Display (int [] arr) {
		for (int i = 0; i<arr.length; i++) {
		System.out.println(arr[i] +" ");
		}
	}
		
	}
	        