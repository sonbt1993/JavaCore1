package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        var a = new TicketNumber();
        a.numbersPrint();

        var b = new LotteryNumber();
        b.lotteryPrint();

        var c = new CheckAward(a, b);
        c.checkAward();
        c.printAward();
    }
}









