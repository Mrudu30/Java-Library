// Write a java program to reverse elements of array using logic of swapping
// elements. Here, use concept of passing array as argument to method. method.
// Use Scanner class to enter Array elements.

import java.util.Scanner;

class Reverse {
    void ReverseElements(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        System.out.print("The Reversed Array is:[");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
}

public class a2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        Reverse obj = new Reverse();
        obj.ReverseElements(arr);
        sc.close();
    }
}
