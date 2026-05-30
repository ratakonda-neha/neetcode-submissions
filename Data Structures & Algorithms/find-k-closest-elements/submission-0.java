class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        int right = 0;

        while (right < arr.length && arr[right] < x) {
            right++;
        }

         int left = right - 1;

        while (result.size() < k) {
            if (left < 0) {
                result.add(arr[right]);
                right++;
            } else if (right >= arr.length) {
                result.add(arr[left]);
                left--;
            } else if (Math.abs(arr[left] - x) <= Math.abs(arr[right] - x)) {
                result.add(arr[left]);
                left--;
            } else {
                result.add(arr[right]);
                right++;
            }
        }

        Collections.sort(result);
        return result;
    }
}