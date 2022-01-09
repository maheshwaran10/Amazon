package com.amazon.app.account;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {


        // 0, 1,153, 370, 371, 407

        Scanner scan =new Scanner(System.in);
        System.out.print("Enter a Number : ");

        int number=scan.nextInt();
        int org_num=number;
        int arm=0;

        int rem;
        while(number>0) {
            rem=number%10;
            arm=arm+(rem*rem*rem);
            number=number/10;

        }
        System.out.println(arm);
        if( org_num==arm) {
            System.out.println("Armstrong Number");
        }else {
            System.out.println("Not an Armstrong Number");
        }


    }
}
