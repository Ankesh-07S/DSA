class Solution {
     List<List<Integer>> subset = new ArrayList<>();
    void solve(int arr[],int index,ArrayList<Integer> ans){
        //base
        if(index>=arr.length){
        subset.add(new ArrayList<>(ans));
            return;
        }
        //inc
        ans.add(arr[index]);
        solve(arr,index+1,ans);
        //backtk
        ans.remove(ans.size()-1);
        //exc
        solve(arr,index+1,ans);

    }

    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        solve(nums,0,ans);
        return subset;

    }
}
