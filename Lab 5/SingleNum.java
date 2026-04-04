public class SingleNum {

    public static int singleNum(int[] nums) {
        int result = 0;
        for (int n : nums) {
            result ^= n;   // XOR cancels duplicates
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};

        int result = singleNum(nums);
        System.out.println(result);
    }
}
