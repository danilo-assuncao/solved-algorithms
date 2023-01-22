import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
    
    public static void main(String[] args) {
        twoSum(new int[] {0, 3, -3, 4, -1}, -1);
    }

    public static int[] twoSum(int[] nums, int target) {
        final var indexMap = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            final var number = nums[i];
            if (indexMap.containsKey(number)) {
                final var value = indexMap.get(nums[i]);
                value.add(i);
            } else {
                final var list = new ArrayList<Integer>();
                list.add(i);
                indexMap.put(number, list);
            }
        }
        final var result = new int[2];
        indexMap.forEach((key, value) -> {
            final var requiredValue = target - key;
            final var valueFound = indexMap.get(requiredValue);
            if (valueFound != null) {
                result[0] = valueFound.get(0);
                if (valueFound.size() * requiredValue == target) {
                    result[1] = valueFound.get(1);
                } else {
                    result[1] = value.get(0);
                }
            }
        });

        // Remove this code when this algorithm is right
        for (int i = 0; i < result.length; i++) {
            System.out.println("index " + i + " = " + result[i]);
        }

        return result;
    }
}
