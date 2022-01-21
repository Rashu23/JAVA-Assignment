import java.util.Scanner;

public class newtec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter your age");
	  int age=sc.nextInt();
	  demo1(age);
	}	
	catch(myexp e){
		System.out.println(e);
	}
	}
	public static void demo1(int age) throws myexp{
		if (age>=18 || age<=25) {
			throw new myexp("age is between 18 to 25 ");
		}
	}
	}
class myexp extends Exception{
	public myexp(String err) {
		super(err);
	}
}

//System.out.println("Rashmi Negi \n".repeat(10));