
package com.example;

import java.util.Scanner;


public class SquareRootWhile {
    
	public static void main(String args[])
    {
    System.out.print("Type a non-negative integer: ");
    Scanner console = new Scanner(System.in);
	int number = console.nextInt();
while(number < 0){
    System.out.print("Type a non-negative integer: ");
    number = console.nextInt();
    }
	int squareRoot = (int)Math.sqrt(number);
        System.out.println("The square root is " + squareRoot);
 }   
}
