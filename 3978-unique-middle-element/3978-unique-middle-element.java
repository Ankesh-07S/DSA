class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n=nums.length;
        int mid=n/2;
        int count=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==nums[mid])
            count++;
        }
        if(count !=0)
        return false;
        else 
        return true;
    }
}