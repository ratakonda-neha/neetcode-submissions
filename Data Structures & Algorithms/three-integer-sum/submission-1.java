class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();

        for(int i =0 ; i < nums.length ; i ++){
            HashSet<Integer> set= new HashSet<>();

            for(int j = i+1 ; j < nums.length ; j++){
                int complement = -nums[i]-nums[j];
                if(set.contains(complement)){
                    List<Integer> triplet = Arrays.asList(nums[i],nums[j],complement);
                    Collections.sort(triplet);

                    result.add(triplet);
                }

                set.add(nums[j]);
            } 
        }
        
        return new ArrayList<>(result);
    }
}