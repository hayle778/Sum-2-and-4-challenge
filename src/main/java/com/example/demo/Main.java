package com.example.demo;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       System.out.print( "input number" );
        Scanner input = new Scanner(System.in);
       System.out.println( "" );
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 2 == 0) && (i % 4 == 0)) {
                count++;
                sum += i;
                System.out.print( "Found number = " + i);

            }
            if (count ==2) {
                break;
            }
        }
   System.out.print( "Sum = " + sum);

    }
}
