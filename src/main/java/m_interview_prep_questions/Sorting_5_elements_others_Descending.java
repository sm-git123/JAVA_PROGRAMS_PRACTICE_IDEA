package m_interview_prep_questions;

import java.util.*;

public class Sorting_5_elements_others_Descending {
    static void printOrder(Integer[] arr, int k)
    {
        int n = arr.length;
 
        // Sort first k elements in ascending order
        Arrays.sort(arr, 0, k);
 
        // Sort remaining n-k elements in descending order
        Arrays.sort(arr, k, n, Collections.reverseOrder());
    }
 
    public static void main(String[] args)
    {
        // Our arr contains 8 elements
        Integer[] arr = { 5, 4, 6, 2, 1, 3, 8, 9, -1 };
        int k = 5;
        printOrder(arr, k);
        System.out.printf(Arrays.toString(arr));
    }
}