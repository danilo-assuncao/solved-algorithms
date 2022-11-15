import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TwoSum {
    
    public static void main(String[] args) {
        twoSum(new int[] {5, 4, 1, 2}, 3);
    }

    public static int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        Arrays.stream(nums).boxed().toList().forEach(it -> System.out.println(it));
        return new int[] {1, 2};
    }
}
