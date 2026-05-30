class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0 ; i < nums.length ; i ++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        
        List<Integer>[] arr = new ArrayList[nums.length +1];

        for(int i=0 ; i<arr.length;i++){
            arr[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> item : map.entrySet()){
            int frequency = item.getValue();
            int key = item.getKey();
            arr[frequency].add(key);
        }

        List<Integer> result = new ArrayList<>();

        for(int i=arr.length-1 ; i>=0 ; i--){
            for(int num: arr[i]){
                result.add(num);
                if(result.size()==k){
                    break;
                }
            }
        } 
        int[] ans = new int[k];
        for(int i = 0 ; i < k ; i++){
            ans[i] = result.get(i);
        }
        return ans;
    }
}