package Arrays;

import java.util.*;
import java.lang.*;
import java.io.*;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        // Step 1: Sort the intervals by their start times
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Step 2: Create a list to store the merged intervals
        ArrayList<int[]> merged = new ArrayList<>();
        System.out.println(merged.size());
        // Step 3: Loop through the intervals and merge them if overlapping
        for (int[] interval : intervals) {
            // If the merged list is empty or there's no overlap
            System.out.println(interval[0] + " " +  interval[1]);
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                // Merge the current interval with the last one in the list
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }

        // Convert the list back to a 2D array
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = { {1, 3}, {2, 6}, {8, 10}, {15, 18} };

        int[][] result = merge(intervals);

        // Print the merged intervals
        System.out.println("Merged Intervals:");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}

