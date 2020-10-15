package com.company;

public class CheckAward {
    private int arr1[];
    private int arr2[];
    private String award;
    private int count = 0;

    public CheckAward(TicketNumber arr1, LotteryNumber arr2) {
        this.arr1 = arr1.getNumbersArr();
        this.arr2 = arr2.getLotteryNumbers();
    }

    public int checkAward() {
        for (int i = 0; i < arr1.length; i++) {
            for (int x = 0; x < arr2.length; x++) {
                if (arr1[i] == arr2[x]) {
                    count++;
                }
            }
        }
        return count;
    }

    public void printAward(){
        switch (count) {
            case 6:  award = "Giai nhat!!";
                System.out.println(award);
                break;
            case 5:  award ="Giai nhi!";
                System.out.println(award);
                break;
            case 4:  award ="Giai ba";
                System.out.println(award);
                break;
            case 3:  award ="Giai khuyen khich";
                System.out.println(award);
                break;
            case 2:  award ="Chuc may man lan sau";
                System.out.println(award);
                break;
            case 1:  award ="Chuc may man lan sau";
                System.out.println(award);
                break;
            case 0:  award ="Chuc may man lan sau";
                System.out.println(award);
                break;
            default: award ="Chuc may man lan sau";
                System.out.println(award);
        }
    }
}
