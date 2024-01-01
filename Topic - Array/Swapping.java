//Swapping of two numbers

import java.util.Scanner;
import java.util.Arrays;

public class Swapping{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array length : ");
        int arrayLength = input.nextInt();
        int[] arr = new int[arrayLength];
        System.out.println("Enter the array values :");
        for (int i = 0; i < arrayLength; i++) {
             arr[i] = input.nextInt();
        }
        System.out.println("Enter the index position to be swapped(index1 & index2) : ");
        int index1 = input.nextInt();
        int index2 = input.nextInt();
        swap(arr, index1, index2);
        System.out.println(Arrays.toString(arr));
        input.close();
    }
    static void swap(int[] arr,int a,int b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b]= temp;
    }
}