import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int findMajorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> countMap = new HashMap<>();

        // Count the occurrences of each element
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Find the element with count greater than n/2
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }

        // No majority element found
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 5, 5, 5, 5};
        int majorityElement = findMajorityElement(nums);
        System.out.println("Majority Element: " + majorityElement);
    }
}
