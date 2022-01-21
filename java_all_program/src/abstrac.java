import java.util.Scanner;

abstract class fact {
  public abstract void factorial();
  int i,n,fact=1;
	Scanner sc=new Scanner(System.in);
//        System.out.print("Enter Any Number");
//        n=sc.nextInt();
        for(i=1;i<=n;i++) {
       	 fact=fact*i;
        }
        System.out.println("Factorial Of The"+" " +n+ " " +"Number Is :" +fact);
        }

}

class prime extends fact {
  public void primenum() {
	  int i,m=0,flag=0;      
	  int n=3; 
	  m=n/2;      
	  if(n==0||n==1){  
	   System.out.println(n+" is not prime number");      
	  }else{  
	   for(i=2;i<=m;i++){      
	    if(n%i==0){      
	     System.out.println(n+" is not prime number");      
	     flag=1;      
	     break;      
	    }      
	   }      
	   if(flag==0)  { System.out.println(n+" is prime number"); }  
	  }
	}    

  }

class abstrac {
  public static void main(String[] args) {
     fact obj = new fact(); 
    System.out.print("Enter Any Number");
  n=sc.nextInt();
  
  }
}