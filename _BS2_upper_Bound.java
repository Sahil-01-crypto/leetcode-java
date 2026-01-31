package leetcode;

 class _BS2_Upper_Bound {

    public static int upperBound(int[] arr, int x) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int index = n; // Default: if no element greater than x is found

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > x) {
                index = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 9, 15, 19};
        int x = 9;

        int ans = upperBound(arr, x);
        System.out.println("Upper bound index is " + ans);
    }
}
