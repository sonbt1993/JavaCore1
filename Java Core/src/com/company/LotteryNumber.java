package com.company;

import java.util.Arrays;

public class LotteryNumber {
    private int size = 6;
    private int[] lotteryNumbers = new int[size];
    private int lotteryNumber;
    public int[] lotteryGenerator(){
        for(int i= 0; i< lotteryNumbers.length; i++){
            lotteryNumber = (int) (Math.floor(Math.random() * 45) + 1);
            for (int j = 0; j<lotteryNumbers.length; j++){
                if(lotteryNumbers[j]==lotteryNumber)
                    lotteryNumber = (int) (Math.floor(Math.random() * 45) + 1);
            }
            lotteryNumbers[i]=lotteryNumber;
        }
        return lotteryNumbers;
    };

    public int[] getLotteryNumbers() {
        return lotteryNumbers;
    }

    public void lotteryPrint() {
        System.out.println("Ket qua xo so: "+Arrays.toString(lotteryGenerator()));
    }
}
