
package com.example;

public class Countdown {

    public static void main(String[] args) {

	int x = 0;
        
        System.out.println("Count up from 0 to 5: ");

        for(int i = 5; i >= 0; i--) {
            System.out.print(i +" ");
		
	x = x + i; 
        }

        System.out.println("\nCount result from 0 to 5: " + x);

	
	x = 0;
        System.out.println("\nAll count even numbers from 0 to 20: ");
        for(int y = 0; y <= 20; y=y+2) {
        System.out.print(y +" ");
        x = x + y;
        }
        System.out.println("\nCount result from 0 to 5: " + x);
    }
}
