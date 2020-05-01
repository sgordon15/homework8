package edu.ti.caih313.homework8;


import java.util.Scanner;

public class FindLargest {
    public static void main(String []args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = keyboard.nextInt();
        int[]a = new int[size];
        System.out.println("Enter" + size + "integers int the array");
        for(int i = 0; i<size; i++){
            a[i] = keyboard.nextInt();

        }
        int largestValues = findLargest(a,0 , a.length-1);
        System.out.println("Largest value in array =" + largestValues);


    }

    public static int findLargest(int[] a, int start, int end){
        int largest = 0;
        if(start==end){

            return a[start];
        }
        else{
            int middle = (start + end)/2;
            int leftLargestValue = findLargest(a, start,middle);
            int rightLargestValue = findLargest(a, middle +1, end);
            if (leftLargestValue > rightLargestValue){
                 largest = leftLargestValue;
            }
            else {
                largest = rightLargestValue;
            }

            return largest;
        }
    }
}
