// learning
// 1.new java ka reserved keyword hai
// 2.int (isme >0) and integer ( isme null chalega) alag hai----> dekh le ek baar..


class Solution {
    public long sumAndMultiply(int n) {
     long new1=0;
     long  new2=0;
      long sum=0;
       while(n>0){
        long g=n%10;
        if(g!=0){
        new1=new1*10+g;
        }
        n=n/10;
       }
       while(new1>0){
        long g=new1%10;
        new2=new2*10+g;
       new1= new1/10;
       }
       long val=new2;
       while(new2>0){
        long g=new2%10;
        sum=sum+g;
        new2=new2/10;
       }
       return val*sum;
    }
}