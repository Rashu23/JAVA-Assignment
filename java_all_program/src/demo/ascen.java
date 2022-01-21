package demo;
import demo.arith;
public class ascen extends arith {
	public  void order() {
	      int a[]=new int[5];
			System.out.print("Enter The Number for ascending");
			for(i=0;i<a.length;i++) {
			
			a[i]=sc.nextInt();
			}
			for(i=0;i<a.length;i++) {
				for(j=i+1;j<a.length;j++) {
					if(a[i]>a[j]) {
						c=a[i];
						a[i]=a[j];
						a[j]=c;
					}
				}
			}
			for(i=0;i<a.length;i++) {
				System.out.print("The Acending Orders Are : ");
				System.out.println( a[i]+"");
			}
			}}


