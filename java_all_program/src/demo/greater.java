package demo;
import demo.arith;
public class greater extends arith {
	public  void arr() {
		int a[]=new int [5];
		int max,i;
		System.out.print("Enter Array Element for maximum");
		for(i=0;i<5;i++) {
			a[i]=sc.nextInt();
			}
		max=a[0];
		for(i=1;i<5;i++) {
			if(a[i]>max){
				max=a[i];
			}
		}
		System.out.println("largest Element Is = " +max);
		}
		}

