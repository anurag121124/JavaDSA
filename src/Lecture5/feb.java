package Lecture5;

public class feb {
	public static void main(String []args) {
	int n =6;
	int a =0;
	int b = 1;
	int i = 1;
	while(i <=n) {
		int c = a+b;
		a = b;
		b=c;
		i++;
	}
	System.out.println(a);
	
	}

}
