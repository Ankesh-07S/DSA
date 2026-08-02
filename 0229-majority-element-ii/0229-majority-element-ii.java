class Solution {
    public List<Integer> majorityElement(int[] nums) {
       int n=nums.length;
       int appear=n/3;
       //we have to find an elelment which apper more than appear times
       HashMap<Integer,Integer>mp=new HashMap<>();
       ArrayList<Integer>arr=new ArrayList<>();
       for(int i=0;i<n;i++){
        if(mp.containsKey(nums[i])){
           mp.put(nums[i],mp.get(nums[i])+1);
        }
        else 
        mp.put(nums[i],1);
       } 
       for(Integer ele:mp.keySet()){
        if(mp.get(ele)>appear){
           arr.add(ele);
        }
       }
       return arr;
    }
}
//we can also use that if wanr to gowith value
// for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {

//     if (entry.getValue() > appear) {
//         arr.add(entry.getKey());
//     }
// }