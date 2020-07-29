package com.company;

import java.util.Scanner;

public class RingCounter {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("numBit 입력 : ");
        int numBits = scanner.nextInt();
        scanner.nextLine();
        System.out.println("numCount 입력 : ");
        int numCount = scanner.nextInt();


        System.out.printf("0b%s\n", Integer.toBinaryString(1 << numCount % numBits));

        //numBits - (numCount % numBits)
        System.out.println("현재 링카운터의 값 : " + (1 << numCount % numBits));

    }
}
