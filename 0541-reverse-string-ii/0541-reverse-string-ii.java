class Solution {
    public void swap(int start,int end,char arr[]){
        while(end>=start){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public String reverseStr(String s, int k) {
        // if(s.length()<k)
        // return s;
      char[] arr=new char[s.length()];
      arr= s.toCharArray();
      for(int i=0;i<arr.length;i=i+2*k){
        int start=i,end=Math.min(i+k-1,arr.length-1);
        swap(start,end,arr);
      }
      return new String(arr);
    }
}