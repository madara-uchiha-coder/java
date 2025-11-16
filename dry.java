class dry {
    public static void main(String[] args) {
        System.out.println(canPartition(new int[] {1,5,11,5}));
    }
    static boolean canPartition(int[] nums) {
        int max=nums[0];
        int ind = 0;
        int count=0;
        for(int i=0; i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                ind=i;
            }
        }
        
        for (int i=0; i<nums.length ;i++){
            if(i!=ind){
            count+=nums[i];}
        }System.out.println(ind);
    return count==max;}
}