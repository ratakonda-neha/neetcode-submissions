class Solution {
    private List<List<Integer>> result;
    private List<Integer> quad;

    public List<List<Integer>> fourSum(int[] nums, int target) {

            Arrays.sort(nums);
            result = new ArrayList<>();
            quad = new ArrayList<>();
            kSum(nums,4,0,target);
            return result;
        }

        private void kSum(int[] nums , int k , int start , long target){
            if(k==2){
                int left = start, right = nums.length-1;
                while(left<right){
                    long sum = nums[left]+nums[right];
                    if(sum<target){
                        left++;
                    } else if(sum>target){
                        right--;
                    } else {
                        result.add(new ArrayList<>(quad));
                        result.get(result.size()-1).add(nums[left]);
                        result.get(result.size()-1).add(nums[right]);
                        left++;
                        right--;

                        while(left<right && nums[left]==nums[left-1])
                            left++;
                        while(left<right&& nums[right]== nums[right+1])
                            right--;
                        
                    }
                } 
               return; 
            } 
            

            for(int i=start ; i <nums.length-k+1 ; i++){
                if(i>start&& nums[i]==nums[i-1]) continue;

                quad.add(nums[i]);
                kSum(nums, k-1,i+1, target-nums[i]);
                quad.remove(quad.size()-1);
            }
        }
        
    }
