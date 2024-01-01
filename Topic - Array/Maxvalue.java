// Finding Max value in an array.

import java.util.Scanner;

public class Maxvalue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array length : ");
        int arrayLength = input.nextInt();
        int[] arr = new int[arrayLength];
        System.out.println("Enter the array values :");
        for (int i = 0; i < arrayLength; i++) {
             arr[i] = input.nextInt();
        }
        System.out.println("Maximum value in array is " + max(arr));
        input.close();
}
        static int max(int[] arr){
            int maxvalue = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]> maxvalue){
                    maxvalue=arr[i];
                }
            }
            return maxvalue;
        }
}
