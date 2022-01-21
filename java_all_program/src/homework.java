
import java.util.Scanner;

class leap
{
	public void sum1(int year)
	{
//		  System.out.println("Enter an Year :: ");
	      Scanner sc = new Scanner(System.in);
	      year = sc.nextInt();

	      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println("Specified year is a leap year");
	      else
	         System.out.println("Specified year is not a leap year");
	}
    }	

class reverse extends leap
{
	
	public void sum2 (int i) {     
		int j,k;
	for(i=1;i<6;i++)      {                              
		for(k=1;k<i;k++) {                                
			System.out.print(" ");                         
		}                                                 
		for(j=1; j<=6-i;j++) {
			System.out.print("*"+" ");
		}
		System.out.println();
	}
	}
	}



class pattern extends reverse
{
	public void sum3 (int i){                             
    int j,k,l;
for(i=1;i<=5;i++) {                           
for(j=4; j>=i;j--) {                   
System.out.print(" ");             
}
for(k=1;k<=i;k++) {
System.out.print("*");
}
for(l=2; l<=i;l++) {
System.out.print("*");
}
System.out.println();
}

}
}
class homework{
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int year;
		System.out.println("enter an year");
		year=sc.nextInt();
		leap obj2=new leap();
		obj2.sum1(year);
		reverse obj=new reverse();
		int i = 0;
		obj.sum2(i);
		pattern obj1=new pattern();
		obj1.sum3(i);
	}
}



