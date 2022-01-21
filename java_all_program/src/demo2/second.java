package demo2;
import java.util.Scanner;

public class second {
public void show1() {
	int a[][]=new int[2][2];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the array data:");
           for(int i=0;i<=1;i++) 
           {
	       for(int j=0;j<=1;j++) {
		a[i][j]=sc.nextInt();
	           }}
           System.out.println("array matrix data:");
           for(int i=0;i<=1;i++)
           {
	       for(int j=0;j<=1;j++) {
           System.out.println(a[i][j]+"");
	       }
	       System.out.println("\n");
               }
           System.out.println("transpose matrix data:");
           for(int i=0;i<=1;i++)
           {
	       for(int j=0;j<=1;j++) {
           System.out.println(a[j][i]+"");
	       }
	       System.out.println("\n");
           }
           }
}
//public class fact extends second {
// public void factorial() {
////        		    Scanner sc=new Scanner(System.in);
//   System.out.print("Enter Any Number for factorial");
////         n=sc.nextInt();
//        for(i=1;i<=n;i++) {
//        fact=fact*i;
//        	     }
//          System.out.println("Factorial Of The"+" " +n+ " " +"Number Is :" +fact);
//              }
//}
//}
//}	
