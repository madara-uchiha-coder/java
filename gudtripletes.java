public class gudtripletes {
    public static void main(String[] args) {
        System.out.println(countGoodTriplets(new int[] {3,0,1,1,9,7}, 7, 2, 3));
    }
    static public int countGoodTriplets(int[] nums, int a, int b, int c) {
        int sum=0;
               for(int i=0;i<nums.length;i++){
           for(int j=i+1;j<nums.length;j++){
            for(int k=j+1;k<nums.length;k++){
            if(Math.abs(nums[i]-nums[j])<=a && Math.abs(nums[j]-nums[k])<=b && Math.abs(nums[i]-nums[k])<=c) {sum++;
                System.out.println("a  =  "+ nums[i]+" b = "+nums[j]+" c = "+nums[k]);
    
            }
        }
        } 
        } 
  return sum;  }
}
