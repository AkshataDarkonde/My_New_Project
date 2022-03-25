
//Write a program to sort the given array  --10

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args)
    {
        int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};
        Arrays.sort(array);
        System.out.println("Elements of array sorted in ascending order: ");
        for (int j : array) {
            System.out.println(j);
        }
    }
}

