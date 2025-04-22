package com.tcf.introjava;

public class CommandArgs {

	public static void main(String[] args)
	{
	        // args[0] and args[1] are command-line arguments (as strings)
	        // Integer.parseInt() is used to convert them into integers
	        int a = Integer.parseInt(args[0]); // Convert first argument to int
	        int b = Integer.parseInt(args[1]); // Convert second argument to int

	        // Perform addition
	        int c = a + b;

	        // Display the result
	        System.out.println("Addition of a and b is: " + c);
	    }
}
