import java.util.Scanner;

public class greatestno {

	public greatestno() {
		// TODO Auto-generated constructor stub
  int a,b,c;
		Scanner sc=new Scanner(System.in);
  System.out.print("Enter Three Number");
  a=sc.nextInt();
  b=sc.nextInt();
  c=sc.nextInt();
  if(a>b && a>c) {
	  System.out.print( a + "" + "" +"number is greater");
  }else if(b>c && b>a) {
	  System.out.print( b + "" + "" +"is greater number");
  }else {
	  System.out.println( c + "" +"" +"is greater number");
  }
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		greatestno obj=new greatestno();
	}

}
