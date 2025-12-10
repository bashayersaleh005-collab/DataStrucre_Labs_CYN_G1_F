package Arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arrayss arr = new Arrayss();

        int []numbers = {1,2,3,4,5,6,7,8,9};

        int result = arr.binarySearch(numbers, 9, 0, numbers.length - 1);

        if(result != -1)
            System.out.println("Value found at index : " + result);
        else
            System.out.println("Value not found!!");
    }
}