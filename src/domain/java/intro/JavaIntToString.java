/*
 Problem Statement:
 You are given an integer n, you have to convert it into a string.
Please complete the partially completed code in the editor. 
If your code successfully converts n into a string s the code will print "Good job". 
Otherwise it will print "Wrong answer".
n can range between −100 to 100 inclusive.
 */
package domain.java.intro;

import java.security.Permission;
import java.util.Scanner;

public class JavaIntToString {
public static void main(String[] args) {
		Scanner in = null;
		Do_Not_Terminate.forbidExit();

		try{
			in = new Scanner(System.in);
			int n=in.nextInt();
			//String s=???; Complete this line below
			String s = String.valueOf(n);
			if(n==Integer.parseInt(s))
			{
				System.out.println("Good job");
			}
			else
			{
				System.out.println("Wrong answer.");
			}
		}
		catch (Do_Not_Terminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
		
	}
}

//The following class will prevent you from terminating the code using exit(0)!
class Do_Not_Terminate {
		 
	    public static class ExitTrappedException extends SecurityException {

			private static final long serialVersionUID = 1L;
	    }
	 
	    public static void forbidExit() {
	        final SecurityManager securityManager = new SecurityManager() {
	            @Override
	            public void checkPermission(Permission permission) {
	                if (permission.getName().contains("exitVM")) {
	                    throw new ExitTrappedException();
	                }
	            }
	        };
	        System.setSecurityManager(securityManager);
	    }
	}	
	
