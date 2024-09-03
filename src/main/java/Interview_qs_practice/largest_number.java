package Interview_qs_practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class largest_number {
    public static void main(String[] args) {
        int[] nums = {1, 5, 3, 9, 7};
        
        // Approach 1
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("Largest number: " + max);
        
        // Approach2
        int largetsNum = Stream.of(1, 5, 3, 9, 7).max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("largest number:"+largetsNum);
        
        // second largest
        List<Integer> list =Arrays.asList(1, 5, 3, 9, 7);
        
        // approach1
        int large = list.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().get();
        System.out.println("second large number:"+large);
        
        // approach2
        Collections.sort(list);
        int large_way2 = list.get(list.size()-2);
        System.out.println("Approach2:second large number:"+large_way2);
        
        
    }
}
