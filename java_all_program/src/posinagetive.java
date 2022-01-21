import java.util.Scanner;

public class posinagetive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num;
        Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num =sc.nextInt();
	
       if(num>0) {
    	   System.out.println(num + "" +"is a positive number");
       }
       else if(num<0) {
    	   System.out.println(num + "" +" is a negative number");
       }
	}

}
