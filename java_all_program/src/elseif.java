import java.util.Scanner;

public class elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sp,cp,res;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter sp");
		sp=sc.nextInt();
		System.out.println("enter cp");
	cp=sc.nextInt()	;
	res=sp-cp;
	if(res==0)
	{
		System.out.println("no profit no loss");
	}
	else if(res>0)
	{
		System.out.println("profit="+res);
	}
	else
	{
		System.out.println("loss="+res);
	}
	}

}
