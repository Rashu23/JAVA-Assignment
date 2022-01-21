
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i,j;
	for(i=0;i<7;i++) {
		for(j=0;j<7/2+1;j++) {
			if (j==0 || j==i+1 || i+j==7/2+2 || i==(j+7/2)){
				System.out.print("*"+"");
			}
			else {
				System.out.print(" "+" ");
			}
		}
		System.out.println();
	}
	}
	}
//		int i,j,k;
//		
//		for(i=0;i<7;i++) {
//			
//		  for(j=7;j>i;j--) {
//			  System.out.print(" ");
//		  }
//		  for(k=0;k<=i;k++) {
//			  if(i==4 || k==0 || k==i)
//			  {
//			  
//				  System.out.print(" "+"*");
//			  }
//			  else 
//			  {
//				  System.out.print(" "+" ");
//			  }
//		  }
//		  System.out.println();
//		}	
//			
//		}
//		}