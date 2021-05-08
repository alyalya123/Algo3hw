package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean foundNum = false;
        int pos = -1;

        int[] array = new int[5000];
        System.out.println("Array length is 5000! ");

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println("Enter a value which do you want to find");
        int neededNum = input.nextInt();
        for (int j = 0; j < array.length && pos == -1;){
            if (j == neededNum){
                pos = j;
                foundNum = true;
            }else {
                j++;
            }
        }
        if (foundNum){
            System.out.println("A num founded and position = " + pos);
        }else {
            System.out.println("Num not founded");
        }
        //Временная сложность O(n)
    }
}
