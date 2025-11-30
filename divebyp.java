
import java.util.Arrays;
public class divebyp {
    public static void main(String[] args) {
        int[] arr={3,5,1,4,2};
        System.out.println(minSubarray(arr, 8));
    }
   static public int minSubarray(int[] nums, int p) {
    int turns=0;
int i= 0 ; 
int j = 0 ;
int s= 0 ;
while(i<nums.length){
if(s<sum(nums)%p || j==nums.length-1){
    i++;
    j=0;
    turns=0;
    s=0;
}
if(s==sum(nums)%p){
    return turns;
}
s=nums[i]+nums[j];
j++;
}

   return turns; }

    static int sum(int[] arr){
        int su=0;
        for(int i=0;i<arr.length;i++){
            su+=arr[i];
        }
    return su;}
}
