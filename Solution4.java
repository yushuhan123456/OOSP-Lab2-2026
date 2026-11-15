import java.util.Arrays;

/**
 * 给定一个无序数组，返回排序后相邻元素之间的最大差值。
 * 要求使用线性时间、线性额外空间，因此采用基数排序。
 */
class Solution4 {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return 0;
        }

        long exp = 1;
        int[] buf = new int[n];
        int maxVal = Arrays.stream(nums).max().getAsInt();

        while (maxVal >= exp) {
            int[] cnt = new int[10];

            for (int i = 0; i < n; i++) {
                int digit = (int) ((nums[i] / exp) % 10);
                cnt[digit]++;
            }

            for (int i = 1; i < 10; i++) {
                cnt[i] += cnt[i - 1];
            }

            for (int i = n - 1; i >= 0; i--) {
                int digit = (int) ((nums[i] / exp) % 10);
                buf[cnt[digit] - 1] = nums[i];
                cnt[digit]--;
            }

            System.arraycopy(buf, 0, nums, 0, n);
            exp *= 10;
        }

        int result = 0;
        for (int i = 1; i < n; i++) {
            result = Math.max(result, nums[i] - nums[i - 1]);
        }
        return result;
    }
}