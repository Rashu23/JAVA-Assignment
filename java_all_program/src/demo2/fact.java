package demo2;
import demo2.second;
import java.util.*;
public class fact extends second {
	 public void factorial() {
			int i,n,fact=1;
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter Any Number for factorial");
	         n=sc.nextInt();
	        for(i=1;i<=n;i++) {
	        fact=fact*i;
	        	     }
	          System.out.println("Factorial Of The"+" " +n+ " " +"Number Is :" +fact);
	              }
}
		
