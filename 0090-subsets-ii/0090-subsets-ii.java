class Solution {
    List<List<Integer>> subset = new ArrayList<>();
    public void solve(int arr[],int index,ArrayList<Integer> ans){
        //base
        if(index>=arr.length){
          if(subset.contains(ans)){
        
          }
          else{
          subset.add(new ArrayList<>(ans));
          }
          return;
        }
        //include
        ans.add(arr[index]);
        solve(arr,index+1,ans);
        //back
        ans.remove(ans.size()-1);
        //exclude
        solve(arr,index+1,ans);

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        solve(nums,0,ans);
        return subset;
    }
}