import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for (int num : nums1)
            set1.add(num);

        for (int num : nums2)
            if (set1.contains(num))
                result.add(num);

        int[] ans = new int[result.size()];
        int i = 0;

        for (int num : result)
            ans[i++] = num;

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna