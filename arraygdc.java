public class arraygdc {
    public static void main(String[] args) {
       int[] nums= {7,5,6,8,3} ;
       System.out.println(findGCD(nums));
    }
     static  public int findGCD(int[] nums) {
       int small=nums[0];
       int max=0;
for(int i =0 ; i<nums.length;i++){
    if(small>nums[i]) small=nums[i];
    if(max<nums[i]) max=nums[i];
}
System.out.println(small+" - "+max);return gcd(small,max);}
 static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
