import java.util.Scanner;

class bank_demo{
	private int ac_no;
	public String name;
	public int balance=450000,fm,withdrawAm;
	public static int depositAm;
	public int year,IR;
	public float si,p,r,t;
	Scanner sc=new Scanner(System.in);
	public void set_interest(int newval) {
		fm=newval;
	}
	public int get_interest() {
		return fm;
	}
	public int getAc_no() {
		return ac_no;
	}
	public void setAc_no(int ac_no) {
		this.ac_no = ac_no;
	}
	
	public int acc(int balance2) {
		System.out.println("enter your name");
		name=sc.next();
		System.out.println("enter your acc number");
		setAc_no(sc.nextInt());
       System.out.println("enter the principal :");
       p=sc.nextFloat();
       System.out.println("enter the rate of interest");
       r=sc.nextFloat();
       System.out.println("enter the time period");
       t=sc.nextFloat();
           si=(r*t*p)/100;
       System.out.println("the Rate of interest is :"+si);
//       System.out.println("final amount");
       fm=(int) (balance+si);
       System.out.println("current balance : "+balance);
       System.out.println();
	System.out.println("Withdraw operation : ");
	System.out.println("Withdraw Amount : "+ withdrawAm);
	if (balance>=withdrawAm) {
		balance=balance-withdrawAm;
		System.out.println("please collect your money and collect the card: ");
             acc(balance);
	}
	else {
		System.out.println("sorry insufficent funds: ");
		System.out.println();
}
	return balance;

	}
	public static int amountDeposit(int depositAm,int balance) {
		System.out.println("deposit operation : ");
		System.out.println("depositing amount : "+depositAm);
	balance=balance+depositAm;
	System.out.println("your balance has been successfully deposited ");
	return balance;

	
		
	}
	}
public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
bank_demo obj=new bank_demo();
obj.set_interest(0);
obj.setAc_no(0);
obj.acc();
System.out.println("your account num is = "+obj.getAc_no()); 
System.out.println("your name is = "+obj.name); 
System.out.println("your balance is = "+obj.balance);
System.out.println("your final amount is "+obj.fm);

 


	}

}
