package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedElement = intArray.length -1; lastUnsortedElement > 0; lastUnsortedElement--) {
            for(int i = 0; i < lastUnsortedElement; i++) {
                if(intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i+1);
                }
            }
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int[] array, int i, int j) {
        if(i==j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
