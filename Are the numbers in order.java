import java.util.Arrays;
public class Solution {
    public static boolean isAscOrder(int[] arr) {
        int arrayLength = arr.length;
        int checkArray[]= Arrays.copyOf(arr,arrayLength );
        Arrays.sort(checkArray);
        return Arrays.equals(arr, checkArray);
    }

}

