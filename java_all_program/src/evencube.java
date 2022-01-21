import java.util.Scanner;

public class evencube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
        Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num =sc.nextInt();
	
       if(num%2==0) {
    	   System.out.println(num+" is even num and the cube is :"+ "" +(num*num*num));
       }
       
       else {
    	   System.out.println("this is odd num");
       }
	}
	}