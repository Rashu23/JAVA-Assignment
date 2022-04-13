package excepton_prog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class try_catch_program {

	public static void main(String [] args ) throws IOException
	
	{
		// TODO Auto-generated method stub
try {
	int n1=0,n2;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter a number");
    n1=Integer.parseInt(br.readLine());
    System.out.print("enter second number");
    n2=Integer.parseInt(br.readLine());
    n1/=n2;
    System.out.print("division of two number is"+n1);
}
catch (Exception e){
	System.out.print(e.getMessage());
	
}
	}

}
