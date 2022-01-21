import java.util.Scanner;

class pali
{
	public void sum1(int n)
	{
		int rev=0,z = 0;
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
    }	




class sod extends pali
{
public void sum2(int n) {
  int s=0,r;
  while(n>0) {
	  r=n%10;
	  s=s+r;
	  n=n/10;
  }
  System.out.println("\n" +"the sum of digit is = "+ s);
}	
}


class arm extends sod
{
public void sum3(int n) {
	 int arm=0,rem,c;
	 c=n;
   while(n>0) {
  	 rem=n%10;
  	 arm=(rem*rem*rem)+arm;
  	 n=n/10;
   }
   if(c==arm)
  	 System.out.print( arm+" is a Armstrong Number");
   else 
   System.out.print( arm+" is not a Armstrong Number");
	}	
}
class inheri{
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the number");
		n=sc.nextInt();
		pali obj2=new pali();
		obj2.sum1(n);
		sod obj=new sod();
		obj.sum2(n);
		arm obj1=new arm();
		obj1.sum3(n);
	}
}


