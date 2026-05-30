class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int left = 0;
        int right = people.length - 1;
        int max = 0 ;
        Arrays.sort(people);
        while(left<=right){
            int sum = people[left]+people[right];
            if(sum > limit){
                max++;
                right --;
            }else{
                max++;
                right--;
                left++;
            }
        }
        return max;
    }
}