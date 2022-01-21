package demo;

import java.util.Scanner;

public  class arith  {
	int a,b,i,max,j,c;

	Scanner sc=new Scanner(System.in);
public void  show () {	
	a=sc.nextInt();
	b=sc.nextInt();
	System.out.println("enter any two number");
		System.out.println("addition of num is "+(a+b)+"\n sub of num is"+(a-b)+ "\n division of num "+(a/b)+"\n modules of num is "+(a%b)+" \n multi of num is"+(a*b));
	}
}
