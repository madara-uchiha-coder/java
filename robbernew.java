

public class robbernew {
            public static void main(String[] args) {
            System.out.println(rob(new int[]{1,3,1,3,100}));
        }
    static int rob(int[] nums)
    {
        if(nums.length==1) return nums[0];
        if(nums.length==3){
            int max= 0 ;
            for(int i =0 ; i<nums.length;i++){
                if(max<nums[i]) max=nums[i];
            }
            return max;
        }
        return nums.length%2==0?even(nums):odd(nums);
    }
    static int even(int[] nums){
        int sum1=0;
        int sum2=0;
        for(int i=0;i<nums.length-1;i+=2){
            sum1+=nums[i];
        }
        for(int i=1;i<nums.length;i+=2){
            sum2+=nums[i];
        }
        if(sum1>sum2) return sum1;
    return sum2;}
    static int odd(int[] nums){
        if(corner(nums)){
            int case2=0;
            int i=2;
            int j=2;
        while(j<=nums.length){
            int sum1=0;
            for(i=1;i<nums.length;i=i+j){
                sum1+=nums[i];
            }
            if (case2<sum1) {
            case2=sum1;
        }
    j++;}
        j=2;
        while(j<=nums.length){
            int sum1=0;
            for(i=0;i<nums.length-2;i=i+j){
                sum1+=nums[i];
            }
            if (case2<sum1) {
            case2=sum1;
        }
    j++;}
        return case2;
        }



        int sum2=0;
        int i=0;
        int j=2;
        while(j<=nums.length-3){
            int sum1=0;
        while(i<nums.length-1){
            sum1+=nums[i];
            i=i+j;
        }
        if (sum2<sum1) {
            sum2=sum1;
        }
    j++;}
        i=1;
        j=2;
        while(j<=nums.length-3){
            int sum1=0;
        while(i<nums.length){
            sum1+=nums[i];
            i=i+j;
        }
        if (sum2<sum1) {
            sum2=sum1;
        }
    j++;}
    return sum2;}
    static boolean corner(int[] nums){
int max=0;
for(int i=0;i<nums.length;i++){
    if(nums[i]>max){
        max=nums[i];
    }
}
if(nums[0] == max || nums[nums.length-1]==max) return true;
   return false; }
}
