class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0 , right= numbers.length-1;

        while(left<right){
            int Cursum= numbers[left]+numbers[right];

            if(Cursum<target){
                left++;
            } else if(Cursum>target){
                right--;
            } else {
                return new int[] {left+1 , right+1};
            }
        } return new int[0];
    } 
}
