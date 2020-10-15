package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TicketNumber {
    private int size = 6;
    private int[] numbersArr = new int[size];
    private int ticketNumber;
    public int[] ticketNumberGenerator(){
        for(int i = 0; i< numbersArr.length; i++) {
            System.out.println("So thu "+(i+1)+" la: ");
            Scanner input = new Scanner(System.in);
            ticketNumber = input.nextInt();

                for (int j = 0; j < numbersArr.length; j++) {
                    if (numbersArr[j] == ticketNumber) {
                        System.out.println("So da chon ! So chon lai la: ");
                        ticketNumber = input.nextInt();
                    }
                    if (ticketNumber<0||ticketNumber>45){
                        System.out.println("Chon so tu 1-45! So chon lai la: ");
                        ticketNumber = input.nextInt();
                    }
                }
                numbersArr[i] = ticketNumber;
        }
        return numbersArr;
    };

    public int[] getNumbersArr() {
        return numbersArr;
    }

    public void numbersPrint() {
        System.out.println("Cac so da chon la: "+Arrays.toString(ticketNumberGenerator()));
    }
}
