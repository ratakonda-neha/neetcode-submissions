class Solution {
    public void sortColors(int[] nums) {
        int mid = 0 , left =0 , right =nums.length-1;
        while(mid<=right){
            if (nums[mid]==0){
                swap(nums,mid,left);
                left ++ ;
            } else if(nums[mid]==2){
                swap(nums,mid,right);
                mid--;
                right--;
            }
            mid++;
        }

    }   
    private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
    } 
}


