import java.util.Scanner;

class fact{
	public void sum1(int a) {
		int i,fact=1;

		for(i=1;i<=a;i++) {
        	 fact=fact*i;
         }
         System.out.println("Factorial Of The"+" " +a+ " " +"Number Is :" +fact);
	}
}

class greater{
public static void sum2(int a) {
	int b = 0,c = 0;
	if(a>b && a>c) {
		  System.out.print( a + "" + "" +"number is greater");
	  }else if(b>c && b>a) {
		  System.out.print( b + "" + "" +"is greater number");
	  }else {
		  System.out.println( c + "" +"" +"is greater number");
	  }
}

class addi extends fact implements greater{

	public static void sum3(int a ) {
		int sum=0;
		int b[]=new int[5];
		for(a=0;a<5;a++)
		{
			Scanner sc = null;
			b[a]=sc.nextInt();
		}
		for(a=0;a<5;a++) {
		sum=sum+b[a];	
		}
		System.out.println("addition of 5 num is : "+a);
		}
	
}
public class hybrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        fact obj=new fact();
        obj.sum1(a);
//       
//        greater obj3=new greater();
//        obj3.sum3(a); 
        addi obj2=new addi();
           addi.sum3(a);
	}
}
}
//public void sum3(int a);
//}







