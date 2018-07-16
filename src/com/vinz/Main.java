package com.vinz;

import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here

        int[] myIntegers = getIntegers(5);
        int[]sorted = sortIntArray(myIntegers);
        printArray(sorted);

    }
    public static int[] getIntegers(int capacity){
        int array[]=new int[capacity];
        System.out.println("Enter " +capacity+ "  values that are valid int:\r");
        for(int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }
        return array;
    }
    public static void printArray(int [] array){
        for (int i =0;i<array.length;i++){
            System.out.println("Element "+ i+ " Contains "+array[i]);
        }

    }
    public static int[] sortIntArray(int[] array){
        int[] sortedArray = new int[array.length]; //creating an array of the
        //length of array already available
        for(int i=0; i<array.length;i++){
            sortedArray[i]=array[i]; //copied content of array to sorted array
            //manual array copy demonstrated for beginners can be replaced by System.arraycopy();
        }
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for (int i =0;i<sortedArray.length-1;i++){ //ending element is always one less than the total
                //because we are using i+1 in the comparisions i.e. i < i+1 block
                if(sortedArray[i]<sortedArray[i+1]){
                    temp =sortedArray[i];
                    sortedArray[i]= sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag= true;

                }

            }
        }
        return sortedArray;
    }
}
