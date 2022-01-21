import java.util.Scanner;

public class demowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int min,max;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the min number");
		min=sc.nextInt();
		System.out.println("enter the max number");
		max=sc.nextInt();
		while(min<=max){
			System.out.println("n="+min);
			min++;
		}
	}

}
