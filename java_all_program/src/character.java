import java.util.Scanner;

public class character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         char ch;
         Scanner sc =new Scanner(System.in);
 		System.out.println("enter any character");
         ch=sc.next().charAt(0);
         
         switch(ch)
 		{
 		case 'a' :
 		case 'e':
 		case 'i':
 		case 'o':
 		case 'u' :

 			System.out.println("vowel");
 		break;
 		default :
        System.out.println("consonant");
 		}
	}

}
