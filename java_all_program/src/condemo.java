import java.util.Scanner;

public class condemo {

	public condemo() {
	// TODO Auto-generated constructor stub
	int n,rev=0,z;
	System.out.print("enter any number");
    Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	z=n;
	while(n>0) {
	rev=(rev*10)+n%10;
	n=n/10;
	System.out.println("the palidrome number is ="+rev);
	
	}
           if(rev==z)
	System.out.print(rev+ "= is palidrome number");
           else
        	   System.out.print(rev+"= is not a palidrome number");
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     condemo obj =new condemo();
    
	}
}
