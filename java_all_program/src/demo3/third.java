package demo3;
import demo.*;
import demo2.*;

import java.util.Scanner;

public class third {
	Scanner sc=new Scanner(System.in);
 public void sum(){
	 int n,r,sum=0;
		System.out.println("Enter Any Number for sum of digit");
		n=sc.nextInt();
		while(n>0) {
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println("the sum of digits is ="+ sum);
		}
public static void main(String[] args) {
		// TODO Auto-generated method stub
         	
           fact obj2=new fact();
         	 obj2.factorial();
           third obj4=new third();
             obj4.sum();
           arith obj1=new arith();
             obj1.show();
           second obj3=new second();
              obj3.show1();
           ascen obj6=new ascen();
             obj6.order();
           greater obj5=new greater();
             obj5.arr();
 }

}
