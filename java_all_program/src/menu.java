import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ans;
		int choice,total=0 ,ch;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println(":Menu:");
			System.out.println("1:Starters\n2:Main Course\n3:Dessert");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("starters.");
				System.out.println("1.Corns \t\t\t\t 300 RS.\t half"+""+300/2);
				System.out.println("1.Spring \t\t\t\t 270 RS.\t half"+270/2);
				System.out.println("1.Crispy \t\t\t\t 200 RS.\t half"+200/2);
               ch=sc.nextInt();
               switch(ch) {
               case 1:
            	   total=300/2;
            	   total=total+300;
            	   break;
               case 2:
            	   total=270/2;
            	   total=total+270;
            	   break;
               case 3:
            	   total=200/2;
            	   total=total+200;
            	   break;
            	   default:
            		   System.out.println("invalid item");
            		   break;
               }
               break ;
			case 2:
				System.out.println("Main Course.");
				System.out.println("1.Mushroom\t\t 400 RS\t half."+""+400/2);
				System.out.println("2.veg biryani\t\t 200 RS.\t half."+""+200/2);
				System.out.println("3.paneer masalat\t 240\t RS.half"+"" +240/2);
               ch=sc.nextInt();
               switch(ch) {
               case 1:
                    total=total+400;
            	   break;
               case 2:
//            	   total1=2;
//            	   total1=total/total1;
            	   total=total+200;
            	   break;
               case 3:
//            	   total1=2;
//            	   total1=total1/total;
            	   total=total+240;
            	   break;
            	   default:
            		   System.out.println("invalid item");
            		   break;
               }
               break;
			case 3:
				System.out.println("Deseert.");
				System.out.println("1.Gulab jamun\t\t 200 RS"+"\t\t"+"Half"+200/2);
				System.out.println("1.Rasmalai \t\t 400 RS"+"\t\t"+"Half"+400/2);
				System.out.println("1.kaju katari\t\t 500 RS"+"\t\t"+"Half"+500/2);
               ch=sc.nextInt();
               switch(ch) {
               case 1:
            	   total=total+200;
            	   break;
               case 2:
            	   total=total+400;
            	   break;
               case 3:
            	   total=total+500;
            	   break;
            	   default:
            		   System.out.println("invalid item");
            		   break;
               }
               break; 
               default:
            	   System.out.println("invalid choice entered please enter valid number.");
            	   break;
            	   }
			System.out.println("do you want to add some more items y/n");
			ans=sc.next().charAt(0);
		}
		while(ans=='y'|| ans=='Y');
		System.out.println("thanks for coming");
		System.out.println("your bill is ="+total);
            	   
			}
		}
