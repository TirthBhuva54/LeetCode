class Solution {
    public int subtractProductAndSum(int n) {
        int temp=n,sum=0,res=1;
        int result;
        while(temp!=0){
            int digit=temp%10;
            res=res*digit;
            sum=sum+digit;
            temp=temp/10;
        }
         return (res-sum);
         
    }
}