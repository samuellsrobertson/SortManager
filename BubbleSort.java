package com.sparta.sr;

public class BubbleSort {
    public static int[] doBubbleSort(int[] arrayOfNumbers) {

        for(int i = 0; i < arrayOfNumbers.length; i++) {
            for(int k = 0; k < arrayOfNumbers.length; k++) {
                if(arrayOfNumbers[i] < arrayOfNumbers[k]) {
                    swap(arrayOfNumbers, i, k);
                }
            }
        }
        return arrayOfNumbers;
    }

    public static void swap(int[] arrayOfNumbers, int i, int k) {
        int numberAtPositionI = arrayOfNumbers[i];
        int numberAtPositionK = arrayOfNumbers[k];
        arrayOfNumbers[i] = numberAtPositionK;
        arrayOfNumbers[k] = numberAtPositionI;
    }
}
