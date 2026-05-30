class Solution {

    public static void swap(int[] nums , int i , int j){

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int firstMissingPositive(int[] nums) {
        int i = 0 ;
        int n = nums.length;

        while(i<n){
            int correctIndex = nums[i]-1;

            if(nums[i]>0 && nums[i]<= n && nums[i]!= nums[correctIndex]){
                swap(nums , i , correctIndex);
            } else {
                i++ ;
            }
        }

        for(int k = 0 ; k < n ; k++){
            if(nums[k]!= k+1){
                return k+1 ;
            }
        }

        return n+1;
    }
}