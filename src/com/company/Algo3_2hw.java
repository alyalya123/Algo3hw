package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Algo3_2hw {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[]{-5, -4, -1, 14, 16, 24, 32, 36, 42, 42, 53, 55, 73, 74, 216};
        int firstNum = 0;
        int lastNum = array.length - 1;
        boolean foundNum = false;
        int i = 0;
        int middleNum = 0;
        System.out.println(Arrays.toString(array) + "\nEnter a value which do you want to find:");
        int neededNum = input.nextInt();

        while (firstNum <= lastNum) {
            middleNum = (firstNum + lastNum) / 2;
            i++;
            if (array[middleNum] == neededNum) {
                foundNum = true;
                break;
            } else if (array[middleNum] > neededNum) {
                lastNum = middleNum - 1;
            } else {
                firstNum = middleNum + 1;
            }
        }
        if (foundNum) {
            System.out.println("Steps:" + i + " Element index:" + middleNum);
        } else {
            System.out.println("Num not founded!");

        }
    }
}
