//random OTP generator//
package otp;

import java.util.Random;

public class otpj {
              static char[] OTP(int len) {
            	  System.out.println("Generating OTP using random () : ");
            	  System.out.print("your OTP IS : ");
            	  String numbers ="0123456789";
            	  Random rndm_method=new Random();
            	  char [] otp=new char[len];
            	  for(int i=0; i<len; i++) {
            		  otp[i]= numbers.charAt (rndm_method.nextInt(numbers.length()));
            	  }
            	  return otp;
            	  
              }
              public static void main(String[] args) {
            	  int length=4;
            	  System.out.println(OTP(length));
              }
	}


