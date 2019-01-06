package com.devops.project3;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int n=0;
        Scanner scanf = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        n = scanf.nextInt();
        
        if(n <= 0 )                   
          System.out.println("Enter numbers between 1 to 100");
       
       else
       {
          convertNumberToWord a = new convertNumberToWord();
         
          a.pw((n%100)," ");
        }

    }
}
