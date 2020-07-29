package com.company;

public class RingCounter {

    public static void main(String[] args){

        int numBits = 12;
        int numCount = 19;

        System.out.printf("0b%s\n", Integer.toBinaryString(1 << numCount % numBits));

        //numBits - (numCount % numBits)
        System.out.println("현재 링카운터의 값 : " + (1 << numCount % numBits));

    }
}
