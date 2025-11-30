public class solution {
    public static void main(String[] args) {
        int[] arr={3,9,7};
        System.out.println(minOperations(arr, 5));
    }
    static public int minOperations(int[] nums, int k) {
        int min=0;
        int j=0;  System.out.println(sum(nums)%k);
        int kj= sum(nums)%k;
       for(int i = 0 ; i<kj%k+j;i++) {
        if(nums[j]!=0) {
            nums[j]=nums[j]-1;
            min++;
            System.out.println("in loop 1 "+nums[j]);
        }
        else{
            System.out.println("in loop 2 "+j);
            j++;
        }
       }
     
   return min; }
   static int sum(int[] arr){
        int s=0;
        for(int i = 0 ; i<arr.length;i++) s+=arr[i];
        return s;
    }}

